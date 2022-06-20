package example_8;

public class User3<B> {
    public B age;

    public User3() {

    }

    public User3(B age) {
        this.age = age;
    }

    public B getAge() {
        return age;
    }

    public void setAge(B age) {
        this.age = age;
    }

    public String toString() {
        return "Age: " + this.age;
    }
}
