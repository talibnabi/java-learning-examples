package example_6;

public class Main {
    public static void main(String[] args) {
        Container<User4> container = new Container<>();
        Container<User2> container1 = new Container<>();
        example_2(container);
        example_1(container1);
    }

    private static void example_1(Container<? extends User3> container) {
        container.doItSecond();
    }

    public static void example_2(Container<? super User3> container) {
        container.doIt(new User2());
        container.doIt(new User());
    }
}
