package lesson.person;

public class Person1 {
    String name;
    String surname;
    Person1[] children;

    public Person1(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person1(String name, String surname, Person1[] children) {
        this.name = name;
        this.surname = surname;
        this.children = children;
    }
    public static void main(String[] args) {
        new Person1("Jim", "Bim");
        // I don't like it
        new Person1("Jim", "Bim", new Person1[]{
                new Person1("Sergio", "Jim")
        });
    }

}
