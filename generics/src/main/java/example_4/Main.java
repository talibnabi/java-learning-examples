package example_4;

public class Main {
    public static void main(String[] args) {
        //example_first();
        //example_second();
    }

    public static void example_first() {
        Container<User, User2> container = new Container<>();
        container.setObject(new User());
        container.setObject_second(new User2());
        User user = container.getObject();
        User2 user2 = container.getObject_second();
        user.setName("Alisa");
        user.setSurname("Aslan");
        user.setAge(20);

        user2.setName("Anara");
        user2.setSurname("Aslan");
        user2.setAge(19);

        System.out.println(user.toString());
        System.out.println(user2.toString());
    }

    public static void example_second() {
        Container<Container<User, User2>, User2> container = new Container<>();

        container.setObject(new Container<>());
        Container<User, User2> container1 = container.getObject();
        container1.setObject(new User());
        User user = container1.getObject();
        container1.setObject_second(new User2());
        User2 user2 = container1.getObject_second();
        user.setName("Talib");
        user.setSurname("Nabi");
        user.setAge(20);
        user2.setName("Safar");
        user2.setSurname("Safarov");
        user2.setAge(19);
        String userInfo = user.toString();
        String user2Info = user2.toString();
        String allInfo1 = userInfo + " . " + user2Info;
        container.setObject_second(new User2());
        User2 user21 = container.getObject_second();
        user21.setName("Alisa");
        user21.setSurname("Aslan");
        user21.setAge(20);
        String allInfo2 = user21.toString();
        String allInfo = allInfo1 + " . " + allInfo2;
        System.out.println(allInfo);
    }
}
