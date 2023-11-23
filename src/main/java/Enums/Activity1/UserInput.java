package Enums.Activity1;

import java.util.Scanner;

public class UserInput {
    static double getEarthWeight() {
        Scanner weightScanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        return weightScanner.nextDouble();
    }
}
