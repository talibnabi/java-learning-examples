package textFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadTextFromFileSecond {
    public static void main(String[] args) {
        readTextFromFile();
    }

    protected static void readTextFromFile() {
        String fileName = "students.txt";
        File file = new File(fileName);
        List<String> content = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            Stream<String> lines = bufferedReader.lines();
            content = lines.collect(Collectors.toList());
        } catch (Exception ignored) {
            System.out.println("It was ignored.");
        }
        assert content != null;
        content.forEach(System.out::println);
    }
}
