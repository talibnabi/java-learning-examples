package binaryFile.write;

import binaryFile.util.Person;
import binaryFile.util.Pizza;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteBinaryFileSecond {
    public static void main(String[] args) {
        writeBinaryToFile();
    }

    protected static void writeBinaryToFile() {
        String fileName = "data.bin";
        File file = new File(fileName);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true))) {
            objectOutputStream.writeUTF("Sevilla");
            objectOutputStream.writeObject(new Person("Alisa", "Aslan", 19));
            objectOutputStream.writeObject(new Pizza(2, 12));
            List<Person> dataFirst = List.of(
                    new Person("Anar", "Babayev", 19),
                    new Person("Turan", "Sadiqov", 20)
            );
            objectOutputStream.writeObject(dataFirst);
            List<Pizza> dataSecond = List.of(
                    new Pizza(3, 32),
                    new Pizza(4, 35)
            );
            objectOutputStream.writeObject(dataSecond);
        } catch (Exception ignored) {
            System.out.println("It was ignored.");
        }
    }
}
