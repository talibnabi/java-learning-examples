package lesson;

public class VarArgs {
    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    private static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    private static int smartAdd(int a, int b, int... others) {
        int r = a + b;
        for (int other : others) r += other;
        return r;
    }

    public static void main(String[] args) {
        add(1, 2);
        add(1, 2, 3);
        add(1, 2, 3, 4);
//    add(1,2,3, 4, 5);
        smartAdd(1, 2);
        smartAdd(1, 2, 3, 4, 5, 6, 7, 8);
    }
}
