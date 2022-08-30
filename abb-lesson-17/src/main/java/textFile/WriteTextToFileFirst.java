package textFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextToFileFirst {
    public static void main(String[] args) {

    }

    protected void writeTextToFile() throws IOException {
        String fileName = "students.txt";
        File file = new File(fileName);
        BufferedWriter w = new BufferedWriter(new FileWriter(file, true));
        w.write("Jim");
        w.write("\n");
        w.write("Alex");
        w.write("\n");
        w.write("Sergio");
        w.flush(); // move data memory -> disk
        w.close(); // closing resource
    }
}
