package Collections.HashMaps;

import Collections.Activity2.MovieStar;

import java.time.LocalDate;
import java.util.HashMap;

public class HashMapDemo {

    private final HashMap<String, MovieStar> starMap = new HashMap<String, MovieStar>();

    public void demo() {

        // Add a Movie Star to the HashMap
        MovieStar star = new  MovieStar("Mel", "Gibson", "Mad Max", LocalDate.of(1956, 1, 3));
        starMap.put("Mel", star);
        star = new MovieStar("Tom", "Hanks", "Forest Gump", LocalDate.of(1956, 7, 9));
        starMap.put("Tom", star);
        star = new MovieStar("Jonny", "Depp", "Pirates of the Caribbean", LocalDate.of(1963, 6, 9));
        starMap.put("Jonny", star);

        MovieStar og = starMap.get("Mel");

        printStars();

    }

    public void printStars() {
        for (MovieStar currentStar : starMap.values()) {
            System.out.println(currentStar);
        }

        for (String key: starMap.keySet()) {
            System.out.println("Here's the key: " + key + "\n\tvalue: " + starMap.get(key));
        }
    }
}
