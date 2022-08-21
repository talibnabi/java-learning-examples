package functional.declarative;

import java.util.List;
import java.util.stream.Stream;

public class App {
    //https://docs.oracle.com/javase/8/docs/api/
    public static void main(String[] args) {
//        declarativeApproach();
//        declarativeApproach2();
//        declarativeApproach3();
        declarativeApproach4();
    }

    private static void declarativeApproach() {
        Stream.of(
                        new Person("Alisa", Gender.FEMALE),
                        new Person("Sultan", Gender.MALE),
                        new Person("Samir", Gender.MALE),
                        new Person("Salima", Gender.FEMALE)
                )
                .filter(person -> Gender.FEMALE.equals(person.getGender()))
                .toList()
                .forEach(System.out::println);
    }

    private static void declarativeApproach2() {
        Stream.of(
                        new Person("Alisa", Gender.FEMALE),
                        new Person("Sultan", Gender.MALE),
                        new Person("Samir", Gender.MALE),
                        new Person("Salima", Gender.FEMALE)
                )
                .map(Person::getGender)
                .distinct()
                .toList()
                .forEach(System.out::println);

    }

    private static void declarativeApproach3() {
        Stream.of(
                        new Person("Alisa", Gender.FEMALE),
                        new Person("Sultan", Gender.MALE),
                        new Person("Samir", Gender.MALE),
                        new Person("Salima", Gender.FEMALE)
                )
                .mapToInt(person -> person.getName().length())
                .filter(value -> value < 6)
                .distinct()
                .forEach(System.out::println);
    }

    private static void declarativeApproach4() {
        Stream.of(
                        new Person("Alisa", Gender.FEMALE),
                        new Person("Sultan", Gender.MALE),
                        new Person("Samir", Gender.MALE),
                        new Person("Salima", Gender.FEMALE)
                )
                .mapMultiToInt((person, intConsumer) -> intConsumer.accept(person.getName().length()))
                .filter(value -> value > 5)
                .forEach(System.out::println);
    }
}
