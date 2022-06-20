package example_2;

public class Container<T> {
    private T object;

    public Container() {

    }

    public Container(T object) {
        this.object = object;
    }

    public User doItAndReturn(User user) {
        return user;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
