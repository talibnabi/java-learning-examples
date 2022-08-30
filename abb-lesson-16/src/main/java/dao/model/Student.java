package dao.model;

import dao.Identifiable;

import java.io.Serializable;

public class Student implements Serializable, Identifiable {
    private final int id;
    private final String name;
    private final String surname;
    private final Integer age;

    public Student(int id, String name, String surname, Integer age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int id() {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
