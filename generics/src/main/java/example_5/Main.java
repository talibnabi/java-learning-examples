package example_5;

public class Main {
    public static void main(String[] args) {
        //example_first();
        //example_second();
        example_third();
    }

    public static void example_first() {
        Container<User> container = new Container<>();
        Container<User2> container1 = container.doItAndReturn(new Container<>());
        User user = container1.doItAndReturn(new User());
        user.setName("Alisa");
        user.setSurname("Aslan");
        user.setAge(20);
        String allInfo = user.toString();
        System.out.println(allInfo);
    }

    public static void example_second() {
        Container<User2> container = new Container<>();
        User2 user2 = container.doItAndReturnForUserAndUser2(3, new User2(), new User());
        user2.setName("Alisa");
        user2.setSurname("Aslan");
        user2.setAge(20);
        System.out.println(user2.toString());
    }

    public static void example_third() {
        Container<Container<User>> container = new Container<>();
        container.setObject(new Container<User>());
        Container<User> container1 = container.getObject();
        User user = container1.doItAndReturn(new User());
        user.setName("Alisa");
        user.setSurname("Aslan");
        user.setAge(20);
        System.out.println(user.toString());
    }
}
