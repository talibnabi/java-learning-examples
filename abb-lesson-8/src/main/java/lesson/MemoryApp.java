package lesson;

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    static String format = "My name is %s";
}

public class MemoryApp {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        String user1 = "Alex";
        String user2 = "Jim";
        String user3 = "Alex";
        String user4 = new String("Alex");
        String user5 = "Alex";
        System.out.println(user4.equals(user3));
        System.out.println(user3==user5);
        int x = 5;
        Integer y = 5;
        Cat cat = new Cat("Jacky");
        Cat cat2 = new Cat("Mickey");
        String format = Cat.format;
        String format1 = cat.format;
        String format2 = cat2.format;
        System.out.println(format1);
    }

}
