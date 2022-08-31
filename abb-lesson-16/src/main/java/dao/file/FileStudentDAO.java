package dao.file;

import dao.model.Student;

import java.io.File;

public class FileStudentDAO extends FileDAO<Student> {
    public FileStudentDAO(File file) {
        super(file);
    }
}
