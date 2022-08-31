package dao.main;

import dao.file.FilePersonDAO;
import dao.impl.PersonInMemoryDAO;
import dao.inter.DAO;
import dao.inter.Identifiable;
import dao.model.Person;
import dao.model.Pizza;
import dao.model.Student;

import java.io.File;
import java.util.Optional;

public class AppFirst {
    public static <A extends Identifiable> void soSomething(DAO<A> dao) {
    }

    public static void main(String[] args) {
        Person p = new Person(1, "Jim", "Parker", 22);
        Pizza pz = new Pizza(1, 3, 4);
        Student s = new Student(1, "Jim", "BE5", 12);

        DAO<Person> personInMemoryDAO = new PersonInMemoryDAO();
        personInMemoryDAO.save(p);
        Optional<Person> p1 = personInMemoryDAO.load(123);

        DAO<Person> daoPersonFile = new FilePersonDAO(new File("persons.bin"));
        daoPersonFile.save(p);
        Optional<Person> p2 = daoPersonFile.load(123);

        soSomething(personInMemoryDAO);
        soSomething(daoPersonFile);

    }
}
