package example_3;

public class Main {
    public static void main(String[] args) {
        example_1();
    }

    public static void example_1() {
        Container<User> container = new Container<>();
        container.setObject(new User());
        User user = container.getObject();
        user.setName("Alisa");
        user.setSurname("Aslan");
        user.setAge(20);
        System.out.println(user.toString());
    }
}
