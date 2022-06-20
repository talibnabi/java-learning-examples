package example_3;

public class Container<T extends User> {
    private T object;

    public Container() {

    }

    public Container(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

}
