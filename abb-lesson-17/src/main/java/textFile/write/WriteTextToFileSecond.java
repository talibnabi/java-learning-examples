package textFile.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteTextToFileSecond {
    public static void main(String[] args) {
        writeTextToFile();
    }

    protected static void writeTextToFile() {
        String fileName = "students.txt";
        File file = new File(fileName);
//        File file = new File(""); ignored
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write("Hello");
            bufferedWriter.write("\n");
            bufferedWriter.write("my friend");
            bufferedWriter.write("\n");
        } catch (Exception ignored) {
            System.out.println("It was ignored.");
        }

    }
}
