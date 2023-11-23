package Calculator;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class UserInput {

    static Scanner numberScanner = new Scanner(System.in);
    static double getInputNumber1() {
        System.out.println("Enter a Number: ");
        return numberScanner.nextDouble();
    }

    static double getInputNumber2() {
        System.out.println("Enter Another Number: ");
        return numberScanner.nextDouble();
    }

    static String getUserChoice() {
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Would you like to add, subtract, multiply or divide these numbers?");
        return stringScanner.nextLine();
    }

    static void calculation(double inputNumber1, double inputNumber2, @NotNull String userChoice) {
        if (userChoice.equalsIgnoreCase("Add")) Formulas.adding(inputNumber1, inputNumber2);

        else if (userChoice.equalsIgnoreCase("Subtract")) Formulas.subtracting(inputNumber1, inputNumber2);

        else if (userChoice.equalsIgnoreCase("Multiply")) Formulas.multiplying(inputNumber1, inputNumber2);

        else if (userChoice.equalsIgnoreCase("Divide")) Formulas.dividing(inputNumber1, inputNumber2);
    }
}
