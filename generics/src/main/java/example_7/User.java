package example_7;

public class User extends User2<String> {
    public static void example_1() {
        User user = new User();
        user.name = "Nazmila";
        user.surname = "Aslan";
        user.schoolName = "697.19";
        System.out.println(user.toString());
    }
}
