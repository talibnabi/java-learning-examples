package dao.impl;

import dao.inter.PizzaDAO;
import dao.model.Pizza;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PizzaInMemoryDAO implements PizzaDAO {
    private final Map<Integer, Pizza> map = new HashMap<>();

    @Override
    public void save(Pizza p) {
        map.put(p.id(), p);
    }

    @Override
    public Optional<Pizza> load(int id) {
        return Optional.ofNullable(map.get(id));
    }
}
