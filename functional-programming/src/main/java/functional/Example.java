package functional;

import java.util.ArrayList;
import java.util.List;

public class Example {


    public static void main(String[] args) {
        imperativeApproach();
    }

    private static void imperativeApproach() {
        List<People> people = List.of(
                new People("Alisa", Gender.FEMALE),
                new People("Salim", Gender.MALE),
                new People("Tunar", Gender.MALE),
                new People("Yeter", Gender.FEMALE)
        );
        List<People> peopleList = new ArrayList<>();
        for (People person : people) {
            if (Gender.FEMALE.equals(person.getGender())) {
                peopleList.add(person);
            }
        }
        for (People person : peopleList) {
            System.out.println(person);
        }
    }
}
