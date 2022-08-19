package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example {


    public static void main(String[] args) {
//        imperativeApproach();
//        declarativeApproach();
        predicate1();
    }

    private static void imperativeApproach() {
        List<Person> people = List.of(
                new Person("Alisa", Gender.FEMALE),
                new Person("Salim", Gender.MALE),
                new Person("Tunar", Gender.MALE),
                new Person("Yeter", Gender.FEMALE)
        );
        List<Person> personList = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.getGender())) {
                personList.add(person);
            }
        }
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private static void declarativeApproach() {
        Stream.of(
                        new Person("Alisa", Gender.FEMALE),
                        new Person("Salim", Gender.MALE),
                        new Person("Tunar", Gender.MALE),
                        new Person("Yeter", Gender.FEMALE)
                )
                .filter(person -> Gender.FEMALE.equals(person.getGender())).toList()
                .forEach(System.out::println);
    }

    private static void predicate1() {
        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.getGender());
        Stream.of(
                        new Person("Alisa", Gender.FEMALE),
                        new Person("Salim", Gender.MALE),
                        new Person("Tunar", Gender.MALE),
                        new Person("Yeter", Gender.FEMALE)
                )
                .filter(personPredicate).toList()
                .forEach(System.out::println);
    }
}
