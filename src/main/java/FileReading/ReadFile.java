package FileReading;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public void ScannerRead() {
        try (Scanner fileScanner = new Scanner(new File("src/main/resources/September.txt"))) {
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println("here's a line:  " + line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Hey, we couldn't find the file!" );
        }
    }

    public void BufferRead() {
        try (FileReader fileReader = new FileReader("src/main/resources/September.txt")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileText = "";
            while((fileText = bufferedReader.readLine()) != null) {
                System.out.println(fileText);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Hey, we couldn't find the file!" );
        } catch (IOException ea) {
            System.out.println("Unable to read the File");
        }
    }
}
