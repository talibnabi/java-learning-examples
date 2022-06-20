package example_8;

import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        //example_1();
        // example_2();
    }

    public static void example_1() {
        User user = new User();
        user.name = "Talib";
        user.surname = "Nabi";
        user.schoolName = "697.19";
        user.age = 20;
        String allInfo = user.toString();
        System.out.println(allInfo);
    }

    public static void example_2() {
        User<User2<String>> user = new User<>();
        user.setObject(new User<>());
        User2<String> user2 = user.getObject();
        user2.name = "Alisa";
        user2.surname = "Aslan";
        user2.age = 20;
        System.out.println(user2.toString());
    }
}
