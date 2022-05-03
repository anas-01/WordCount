import java.util.Scanner;
import java.io.File;

public class WordCount {
    public static void main (String [] args) throws Exception{

        // Insert your file name here
        File file = new File("randomfile.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();

            words += line.split(" ").length;

        }

        System.out.println("This file contains: " + words + " words");

    }

}
