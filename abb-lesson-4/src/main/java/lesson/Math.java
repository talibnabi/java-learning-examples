package lesson;

public class Math {

    public static void main(String[] args) {
        int c = 1 + 1;
        int d = add(1, c);
        System.out.printf("%d", d);
    }

    public static void main1(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
