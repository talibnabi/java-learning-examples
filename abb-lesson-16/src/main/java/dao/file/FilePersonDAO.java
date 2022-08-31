package dao.file;

import dao.model.Person;

import java.io.File;

public class FilePersonDAO extends FileDAO<Person> {
    public FilePersonDAO(File file) {
        super(file);
    }
}
