package example_2;

public class Main {
    public static void main(String[] args) {
        //example_first();
        //example_second();
//        User user = example_third(new Container<>());
//        user.setName("Alisa");
//        user.setSurname("Aslanova");
//        user.setAge(20);
//        System.out.println(user.toString());

    }

    public static void example_first() {
        Container<User> container = new Container<>();
        container.setObject(new User());
        User user = container.getObject();
        user.setName("Alisa");
        user.setSurname("Aslanova");
        user.setAge(20);
        System.out.println(user.toString());
    }

    public static void example_second() {
        Container<Object> container = new Container<>();
        container.setObject(1);
        Object object = container.getObject();
    }

    public static User example_third(Container<User> container) {
        User user = container.doItAndReturn(new User());
        return user;
    }
}
