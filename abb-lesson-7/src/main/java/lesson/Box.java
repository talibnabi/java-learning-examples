package lesson;

import java.util.Arrays;

public class Box {
    int a; // width
    int b; // height
    int c; // depth

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean compare(Box box) {
        this.rotate();
        box.rotate();
        return this.a < box.a && this.b < box.b && this.c < box.c;
    }

    private void rotate() {
        int[] params = new int[]{this.a, this.b, this.c};
        Arrays.sort(params);
        this.a = params[0];
        this.b = params[1];
        this.c = params[2];
    }

    public Box rotate2() {
        int[] params = new int[]{this.a, this.b, this.c};
        Arrays.sort(params);
        return new Box(params[0], params[1], params[2]);
    }

    @Override
    public String toString() {
        return String.format("%d x %d x %d", a, b, c);
    }


}
