package example_1;

public class Container<T> {
    private T object;

    public Container() {

    }

    public Container(T object) {
        this.object = object;
    }

    public T method() {
        return this.object;
    }

    public Container<String> getInsideContainer(Container<String> container) {
        return container;
    }

    public Container<Container<String>> getTwiceInsideContainer(Container<Container<String>> container) {
        return container;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
