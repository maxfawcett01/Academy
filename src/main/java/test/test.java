package test;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();

        // Write your code here.

        System.out.printf("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}