package dao.impl;

import dao.inter.PersonDAO;
import dao.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonInMemoryDAO implements PersonDAO {
    private final Map<Integer, Person> map = new HashMap<>();

    @Override
    public void save(Person p) {
        map.put(p.id(), p);
    }

    @Override
    public Optional<Person> load(int id) {
        return Optional.ofNullable(map.get(id));
    }


}
