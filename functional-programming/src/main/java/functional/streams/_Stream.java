package functional.streams;


import functional.declarative.Gender;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class _Stream {
    private static List<Person> getList() {
        return List.of(
                new Person("Alisa", Gender.FEMALE),
                new Person("Salima", Gender.FEMALE),
                new Person("Salman", Gender.MALE),
                new Person("Nobody", Gender.UNKNOWN)
        );
    }

    protected static void streamExample1() {
        getList()
                .stream()
                .map(Person::getName)
                .filter(name -> name.length() > 5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    protected static void streamExample2() {
        Function<Person, String> getPersonName = Person::getName;
        ToIntFunction<String> toInt = String::length;
        IntConsumer intConsumer = System.out::println;
        getList()
                .stream()
                .map(getPersonName)
                .mapToInt(toInt)
                .filter(len -> len > 5)
                .distinct()
                .forEach(intConsumer);
    }

    protected static void streamExample3() {
        boolean check = getList()
                .stream()
                .allMatch(person -> Gender.FEMALE.equals(person.getGender()));
        System.out.println(check);
    }

    protected static void streamExample4() {
        boolean check = getList()
                .stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.getGender()));
        System.out.println(check);
    }

    protected static void streamExample5() {
        boolean check = getList()
                .stream()
                .noneMatch(person -> Gender.FEMALE.equals(person.getGender()));
        System.out.println(check);
    }
}
