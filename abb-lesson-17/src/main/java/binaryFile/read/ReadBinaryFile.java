package binaryFile.read;

import binaryFile.util.Person;
import binaryFile.util.Pizza;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadBinaryFile {
    public static void main(String[] args) {
        readBinaryFile();
    }

    protected static void readBinaryFile() {
        String fileName = "data.bin";
        File file = new File(fileName);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            String text = objectInputStream.readUTF();
            System.out.println(text);

            Person personObj = (Person) objectInputStream.readObject();
            System.out.println(personObj);

            Pizza pizzaObj = (Pizza) objectInputStream.readObject();
            System.out.println(pizzaObj);

            List<Person> person = (List<Person>) objectInputStream.readObject();
            System.out.println(person);
//            person.forEach(System.out::println);

            List<Pizza> pizza = (List<Pizza>) objectInputStream.readObject();
            System.out.println(pizza);
//            pizza.forEach(System.out::println);

        } catch (Exception ignored) {
            System.out.println("It was ignored");
        }
    }
}
