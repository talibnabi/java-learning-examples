package lesson;

public class PassAppStatic {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int x = PassAppStatic.add(1, 2);
        System.out.println(x);
    }

}
