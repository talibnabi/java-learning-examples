package dao.impl;

import dao.inter.StudentDAO;
import dao.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StudentInMemoryDAO implements StudentDAO {
    private final Map<Integer, Student> map = new HashMap<>();

    @Override
    public void save(Student s) {
        map.put(s.id(), s);
    }

    @Override
    public Optional<Student> load(int id) {
        return Optional.ofNullable(map.get(id));
    }
}
