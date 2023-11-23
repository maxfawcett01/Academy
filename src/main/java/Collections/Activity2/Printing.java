package Collections.Activity2;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Printing {
    public static void printList(@NotNull ArrayList<MovieStar> starList) {

        // Print List
        System.out.println("\nList:");
        for (MovieStar currentStar : starList) {
            System.out.println(currentStar.toString());
        }
    }
    public static void sortList(@NotNull ArrayList<MovieStar> starList) {
        System.out.println();

        // Alphabetical Order based on First Name
        System.out.println("First Name:");
        starList.sort(Comparator.comparing(MovieStar::firstName));
        starList.forEach(System.out::println);

        System.out.println();

        // Alphabetical Order based on Last Name
        System.out.println("Last Name:");
        starList.sort(Comparator.comparing(MovieStar::lastName));
        starList.forEach(System.out::println);

        System.out.println();

        //Alphabetical Order based on Movie Name
        System.out.println("Movie Name:");
        starList.sort(Comparator.comparing(MovieStar::mostFamousRole));
        starList.forEach(System.out::println);

        System.out.println();

        //Order based on age
        System.out.println("Age:");
        starList.sort(Comparator.comparing(MovieStar::birthdate));
        starList.forEach(System.out::println);
        System.out.println();
    }
    public static void userInput(@NotNull HashMap<String, MovieStar> starHashMap) {
        String HashInput;
        try (Scanner myScanner = new Scanner(System.in)) {

            System.out.println("Enter an Actors First Name: ");
            HashInput = myScanner.nextLine();
        }

        if (starHashMap.containsKey(HashInput)) {
            System.out.println(starHashMap.get(HashInput));
        }
        else System.out.println("That Movie Star is not available");
    }
}
