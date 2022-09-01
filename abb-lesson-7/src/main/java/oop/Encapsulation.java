package oop;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private Integer age;
    private final List<String> skills;

    public Person(String name, Integer age, String... skills) {
        this.name = name;
        this.age = age;
        this.skills = Arrays.stream(skills).collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        if (age < 18) throw new IllegalStateException("wrong age is provided");
        this.age = age;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }
}

public class Encapsulation {
    public static void whatever(Person p) {
        List<String> skills = p.getSkills();
        skills.clear();
        skills.add("Scala");
    }


    public static void main(String[] args) {
        Person p = new Person("alex", 33, "Python", "Java");
        System.out.println(p);
        whatever(p);
        System.out.println(p);
        p.setAge(44);
        System.out.println(p);

    }

}
