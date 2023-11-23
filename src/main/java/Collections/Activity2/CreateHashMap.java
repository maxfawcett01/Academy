package Collections.Activity2;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class CreateHashMap {
    public static @NotNull HashMap<String, MovieStar> getStarHashMapFromList(@NotNull ArrayList<MovieStar> starList) {
        HashMap<String, MovieStar> starHashMap = new HashMap<>();

        for (MovieStar star : starList) {
            starHashMap.put(star.firstName(), star);
        }
        return starHashMap;
    }
}
