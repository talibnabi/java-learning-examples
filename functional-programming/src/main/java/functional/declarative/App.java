package functional.declarative;

import java.util.List;
import java.util.stream.Stream;

public class App {
    //https://belief-driven-design.com/functional-programming-with-java-streams-190eda591a5/

    public static void main(String[] args) {
//        declarativeApproach();
        declarativeApproach2();
    }

    private static void declarativeApproach() {
        Stream.of(
                        new Person("Alisa", Gender.FEMALE),
                        new Person("Sultan", Gender.MALE),
                        new Person("Samir", Gender.MALE),
                        new Person("Salima", Gender.FEMALE)
                )
                .filter(person -> Gender.FEMALE.equals(person.getGender())).toList()
                .forEach(System.out::println);
    }

    private static void declarativeApproach2() {
        Stream<Person> personStream = Stream.of(
                new Person("Alisa", Gender.FEMALE),
                new Person("Sultan", Gender.MALE),
                new Person("Samir", Gender.MALE),
                new Person("Salima", Gender.FEMALE)
        ).distinct();
        List<Gender> genders = personStream.map(Person::getGender).toList();
        System.out.println(genders);
    }

    private static void declarativeApproach3() {
        Stream<Person> personStream = Stream.of(
                new Person("Alisa", Gender.FEMALE),
                new Person("Sultan", Gender.MALE),
                new Person("Samir", Gender.MALE),
                new Person("Salima", Gender.FEMALE)
        ).distinct();
        List<Gender> genders = personStream.map(Person::getGender).toList();
        System.out.println(genders);
    }
}
