package Calculator;

public class Formulas {
     static double adding(double inputNumber1, double inputNumber2) {
        double adding = inputNumber1 + inputNumber2;
        System.out.println("The Answer is " + adding);
        return adding;
    }

    static double subtracting(double inputNumber1, double inputNumber2) {
        double subtracting = inputNumber1 - inputNumber2;
        System.out.println("The Answer is " + subtracting);
        return subtracting;
    }

    static double multiplying(double inputNumber1, double inputNumber2) {
        double multiplying = inputNumber1 * inputNumber2;
        System.out.println("The Answer is " + multiplying);
        return multiplying;
    }

    static double dividing(double inputNumber1, double inputNumber2) {
        double dividing = inputNumber1 / inputNumber2;
        System.out.println("The Answer is " + dividing);
        return dividing;
    }
}
