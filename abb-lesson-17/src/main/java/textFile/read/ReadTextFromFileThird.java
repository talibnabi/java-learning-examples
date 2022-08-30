package textFile.read;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadTextFromFileThird {
    public static void main(String[] args) {
        readTextFromFile();
    }

    protected static void readTextFromFile() {
        String fileName = "students.txt";
        File file = new File(fileName);
        List<String> content;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            Stream<String> line = bufferedReader.lines();
            content = line.collect(Collectors.toList());
        } catch (IOException ignored) {
            content = new ArrayList<>();
        }
        content.forEach(System.out::println);
    }
}
