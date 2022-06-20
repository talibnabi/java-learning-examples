package example_5;

public class Container<A> {
    private A object;

    public Container() {

    }

    public Container(A object) {
        this.object = object;
    }

    public <B> B doItAndReturn(B object) {
        return object;
    }

    public <B extends User> B doItAndReturnForUser(B object) {
        return object;
    }

    public <B extends User2, C extends User> B doItAndReturnForUserAndUser2(int number, B object, C object2) {
        if (number > 0) {
            return object;
        } else {
            return null;
        }
    }

    public A getObject() {
        return object;
    }

    public void setObject(A object) {
        this.object = object;
    }
}
