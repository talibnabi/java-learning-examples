package example_4;

public class Container<T extends User, V extends User2> extends User {
    private T object;
    private V object_second;

    public Container() {

    }

    public Container(T object) {
        this.object = object;
    }

    public Container(T object, V object_second) {
        this.object_second = object_second;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public V getObject_second() {
        return object_second;
    }

    public void setObject_second(V object_second) {
        this.object_second = object_second;
    }
}

