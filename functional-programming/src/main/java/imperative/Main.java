package imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alisa", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Salim", Gender.MALE),
                new Person("Nurana", Gender.FEMALE)
        );

        //Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }
    }

    private static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    private enum Gender {
        MALE, FEMALE;
    }
}
