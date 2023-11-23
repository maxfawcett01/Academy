package UnitTesting;

public class ZTruncator {

    public String truncateZInFirstTwoPositions(String s) throws NullPointerException, IllegalArgumentException{

        if (s == null )  {
            throw new NullPointerException("A null pointer cannot be parsed");
        }

        if(s.length() == 0) {
            throw new IllegalArgumentException("The String cannot be empty");
        }

        if (s.length() <=2)  {
            return (s.replaceAll("Z", ""));
        }
        String firstTwoChars = s.substring(0, 2);
        String withoutFirstTwoChars = s.substring(2, s.length());

        String truncatedString = firstTwoChars.replaceAll("Z",  "");

        return(truncatedString + withoutFirstTwoChars);
    }
}
