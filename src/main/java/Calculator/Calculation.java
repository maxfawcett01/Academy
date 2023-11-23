package Calculator;

public class Calculation {

    public void Calculator() {

        //Get Numbers from User
//        double inputNumber1 = UserInput.getInputNumber1();
//        double inputNumber2 = UserInput.getInputNumber2();
        double inputNumber1 = 5;
        double inputNumber2 = 6;

        //Get Calculation Type from User
//        String userChoice = UserInput.getUserChoice();

        //Complete the Calculation
//        UserInput.calculation(inputNumber1, inputNumber2, userChoice);
        Formulas.adding(inputNumber1, inputNumber2);
        Formulas.subtracting(inputNumber1, inputNumber2);
        Formulas.multiplying(inputNumber1, inputNumber2);
        Formulas.dividing(inputNumber1, inputNumber2);
    }
}
