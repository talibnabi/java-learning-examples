package dao.model;

import dao.Identifiable;

import java.io.Serializable;

public class Pizza implements Serializable, Identifiable {
    private final int id;
    private final Integer size;
    private final Integer price;

    public Pizza(int id, Integer size, Integer price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }

    @Override
    public int id() {
        return id;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
