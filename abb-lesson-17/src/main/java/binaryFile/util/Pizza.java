package binaryFile.util;

import java.io.Serializable;

public class Pizza implements Serializable {
    private Integer size;
    private Integer value;

    public Pizza(Integer size, Integer value) {
        this.size = size;
        this.value = value;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", value=" + value +
                '}';
    }
}
