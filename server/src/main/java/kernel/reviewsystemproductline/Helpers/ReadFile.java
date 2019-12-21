package kernel.reviewsystemproductline.Helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static String readFile(String fileNameSuffix, String flagName) throws FileNotFoundException {
        String fileName = "config_file-" + fileNameSuffix + ".txt";
        Scanner scanner = new Scanner(new File(fileName));
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String [] words = line.split("==");
            String  word_name = words[0];
            String word_flag = words[1];

            if (word_name.equals(flagName)){
                System.out.println(word_name +' ' +  words[1]);
                return word_flag;
            }
        }
        System.out.println("PATLADIK");
        return "";
    }
}
