package textFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTextFromFileFirst {
    public static void main(String[] args) {
        readTextFromFile();
    }

    protected static void readTextFromFile() {
        String fileName = "students.txt";
        File file = new File(fileName);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception ignored) {
            System.out.println("It was ignored.");
        }
    }
}
