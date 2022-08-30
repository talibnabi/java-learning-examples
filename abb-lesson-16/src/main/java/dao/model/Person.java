package dao.model;

import dao.inter.Identifiable;

import java.io.Serializable;

public class Person implements Serializable, Identifiable {
    private final int id;
    private final String name;
    private final String surname;
    private final Integer age;

    public Person(int id, String name, String surname, Integer age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int id() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
