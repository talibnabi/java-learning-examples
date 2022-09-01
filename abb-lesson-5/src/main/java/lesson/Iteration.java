package lesson;

import java.util.Arrays;

public class Iteration {
    public static void main2(String[] args) {
        // 1..5
        int n = 1;
        while (n <= 5) {
            System.out.print(n);
            n++;
        }
        System.out.println();

        n = 1;
        do {
            System.out.print(n);
            n++;
        } while (n <= 5);
        System.out.println();

        n = 1;
        while (true) {
            if (n > 5) break;
//      if (n > 5) break;
//      if (n > 5) break;
            System.out.print(n);
            n++;
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 1; i <= 5; ) {
            System.out.print(i);
            i++;
        }
        System.out.println();

        for (int i = 1; ; ) {
            if (!(i <= 5)) break;
            System.out.print(i);
            i++;
        }
        System.out.println();

        int i = 1;
        for (; ; ) {
            if (!(i <= 5)) break;
            System.out.print(i);
            i++;
        }
        System.out.println();
    }

    public static void main3(String[] args) {
        int n = 1;
        while (n <= 5) {
            System.out.print(n);
            n++;
        }
        n = n + 100;
    }

    public static void main4(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
        }
//    i = i + 100;
    }

    public static void main(String[] args) {
        int[] xs1 = new int[]{1, 3, 5, 7};
        int[] xs2 = {1, 3, 5, 7};
        int min = min(xs2);
        System.out.println(min);
    }

    // O(n)
    // to find the minimal element
    public static int min(int[] xs) {
        int min = xs[0];                       // exception
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] < min) min = xs[i];
        }
        return min;
    }

    static class Point {
        int x;
        int y;
    }

    static class Person {
        String name;
        int age;
    }

    static class ItemCount {
        String name;
        int count;
        double price;
    }

    static class Cart {
        ItemCount[] items;
        double total;
    }

    static class Result {
        // fields (attributes, ...)
        int min;
        int max;
        double avg;

        public Result(int min, int max, double avg) {
            this.min = min;
            this.max = max;
            this.avg = avg;
        }

        public String represent() {
            return String.format("min: %d, max: %d, avg: %f", min, max, avg);
        }

        @Override
        public String toString() {
            return represent();
        }
    }

    // overloading
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main7(String[] args) {
        add(1, 2);
//    add(1,"Jim");
        add(1, 2, 5);
    }

    // encapsulation == combining
    // minimum, maximum, average values
    public static Result min_max_avg(int[] xs) {
        int min = xs[0];
        int max = xs[0];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] < min) min = xs[i];
            if (xs[i] > max) max = xs[i];
            count++;
            sum += xs[i];
        }
        return new Result(min, max, (double) sum / count);
    }

    // bad:
    // 1. we modify given array
    // 2. it's slower, O(N * log N)
    public static int min2(int[] xs) {
        Arrays.sort(xs);
        return xs[0];
    }
}
