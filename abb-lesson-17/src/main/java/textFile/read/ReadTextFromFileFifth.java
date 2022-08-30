package textFile.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadTextFromFileFifth {
    public static void main(String[] args) {
        String fileName = "students.txt";
        Optional<List<String>> optional = readTextFromFile(fileName);
        optional.ifPresentOrElse(list -> list.forEach(System.out::println)
                , () -> System.out.println(fileName + " not found."));

        System.out.println("----------------------------------------");//or

        List<String> content = optional.orElse(new ArrayList<>());
        content.forEach(System.out::println);
    }

    protected static Optional<List<String>> readTextFromFile(String fileName) {
        File file = new File(fileName);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            Stream<String> line = bufferedReader.lines();
            return Optional.of(line.collect(Collectors.toList()));
        } catch (Exception ignored) {
            return Optional.empty();
        }
    }
}
