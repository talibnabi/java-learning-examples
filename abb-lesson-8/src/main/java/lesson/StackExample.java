package lesson;

public class StackExample {
    public int m2(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    public int m1() {
        int x = 1;
        int y = 2;
        int z = 3;
        int r = m2(x, y, z);
        return r;
    }
}
