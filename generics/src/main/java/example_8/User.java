package example_8;

public class User<A> extends User2<String> {
    private A object;

    public User() {

    }

    public User(A object) {
        this.object = object;
    }

    public A getObject() {
        return object;
    }

    public void setObject(A object) {
        this.object = object;
    }

}
