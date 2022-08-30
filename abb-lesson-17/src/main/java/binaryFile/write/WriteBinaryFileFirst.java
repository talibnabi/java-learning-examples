package binaryFile.write;

import java.io.File;
import java.io.FileWriter;

public class WriteBinaryFileFirst {
    public static void main(String[] args) {
        writBinaryToFile();
    }

    protected static void writBinaryToFile() {
        String fileName = "data.bin";
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(2);
            fileWriter.write("Hi,dear");
            fileWriter.write(4);
        } catch (Exception ignored) {
            System.out.println("It was ignored.");
        }
    }
}
