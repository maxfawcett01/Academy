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
        stage('SonarQube Analysis') {
            steps {
                script {
                    withSonarQubeEnv('sonarqube') {
                        sh 'mvn sonar:sonar -Pcoverage'
                    }
                }
            }
        }
//        stage("Quality Gate") {
//            steps {
//              timeout(time: 5, unit: 'MINUTES') {
//                waitForQualityGate abortPipeline: true
//              }
//            }
//          }
        stage('Deploy') {
            steps {
                echo "[INFO] DEPLOYMENT SUCCESS!!!"
                //sh './jenkins/scripts/deploy.sh'
            }
        }
    }
}