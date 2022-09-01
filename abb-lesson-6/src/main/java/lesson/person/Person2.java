package lesson.person;

public class Person2 {
    String name;
    String surname;
    Person2[] children;

    public Person2(String name, String surname, Person2... children) {
        this.name = name;
        this.surname = surname;
        this.children = children;
    }

    public static void main(String[] args) {
        new Person2("Jim", "Bim");

        new Person2("Jim", "Bim",
                new Person2("Marion", "Jim")
        );

        new Person2("Jim", "Bim",
                new Person2("Sergio", "Jim"),
                new Person2("Marion", "Jim")
        );

        new Person2("Jim", "Bim",
                new Person2("Sergio", "Jim"),
                new Person2("Sergio", "Jim"),
                new Person2("Marion", "Jim")
        );
    }


}
