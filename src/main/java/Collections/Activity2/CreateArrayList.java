package Collections.Activity2;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CreateArrayList {
    static void createStarList(@NotNull ArrayList<MovieStar> starList) {
        starList.add(new MovieStar("Mel", "Gibson", "Mad Max", LocalDate.of(1956, 1,3)));
        starList.add(new MovieStar("Tom", "Hanks", "Forest Gump", LocalDate.of(1956, 7, 9)));
        starList.add(new MovieStar("Johnny", "Depp", "Pirates of the Caribbean", LocalDate.of(1963, 6, 9)));
    }

    static void importStarList(@NotNull ArrayList<MovieStar> starList) {
        try (Scanner fileScanner = new Scanner(new File("src/main/resources/Stars.csv"))) {
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] starInfo = line.split(Pattern.quote(","));
                System.out.println("here's a line:  " + line);
                starList.add(new MovieStar(starInfo[0], starInfo[1], starInfo[2], LocalDate.parse(starInfo[3])));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Hey, we couldn't find the file!" );
        }
    }
}
