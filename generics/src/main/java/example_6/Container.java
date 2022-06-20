package example_6;

import example_8.User;

public class Container<A> {
    private A object;

    public Container() {

    }

    public Container(A object) {
        this.object = object;
    }

    public void doIt(A user) {

    }

    public void doItSecond() {

    }

    public A getObject() {
        return object;
    }

    public void setObject(A object) {
        this.object = object;
    }
}
