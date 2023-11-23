package Collections.Activity2;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity2 {
    public void movieStarActivity() {

        //Create a List Template
        ArrayList<MovieStar> starList = new ArrayList<>();

        // Add a Movie Star to the List
        CreateArrayList.importStarList(starList);

        // Print and Sort the List
        Printing.printList(starList);
        Printing.sortList(starList);

        // Fills HashMap with Movie Star List; Key = First Name
        HashMap<String, MovieStar> starHashMap = CreateHashMap.getStarHashMapFromList(starList);

        // Lets User request info about a movie star
        Printing.userInput(starHashMap);
        }
}

