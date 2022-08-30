package textFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextToFileFirst {
    public static void main(String[] args) throws IOException {
        writeTextToFile();
    }

    protected static void writeTextToFile() throws IOException {
        String fileName = "students.txt";
        File file = new File(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        bufferedWriter.write("Jim");
        bufferedWriter.write("\n");
        bufferedWriter.write("Alex");
        bufferedWriter.write("\n");
        bufferedWriter.write("Sergio");
        bufferedWriter.write("\n");
        bufferedWriter.flush(); // move data memory -> disk
        bufferedWriter.write("Sergioo");
        bufferedWriter.write("\n");
        bufferedWriter.flush();
        bufferedWriter.close(); // closing resource
    }
}
