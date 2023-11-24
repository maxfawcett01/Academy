pipeline {
    agent {
        docker {
            image 'maven:3.9.5-eclipse-temurin-17-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test -f pom.xml'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('OWASP Dependency-Check Vulnerabilities') {
            agent {
                docker {
                    image 'docker:dind'
                    args '-v /var/run/docker.sock:/var/run/docker.sock'
                }
            }
            steps {
                script {
                    // Adjust the path to the Dependency-Check script as needed
                    sh '/var/jenkins_home/tools/org.jenkinsci.plugins.DependencyCheck.tools.DependencyCheckInstallation/dependency-check/bin/dependency-check.sh' + 
                       ' --out "./" --scan "./" --format "ALL" --prettyPrint'
                }
            }
            post {
                always {
                    // You might need to adjust the path to the report file based on Dependency-Check configuration
                    junit 'dependency-check-report.xml'
                }
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {
                    withSonarQubeEnv('sonarqube') {
                        sh 'mvn sonar:sonar -Pcoverage'
                    }
                }
            }
        }
        stage("Quality Gate") {
            steps {
              timeout(time: 15, unit: 'MINUTES') {
                waitForQualityGate abortPipeline: false
                }
            }
        }
        stage('Deploy') {
            steps {
                echo "[INFO] DEPLOYMENT SUCCESS!!!"
                sh './jenkins/scripts/deploy.sh'
            }
        }
    }
}
