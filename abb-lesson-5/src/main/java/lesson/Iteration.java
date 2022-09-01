package lesson;

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
    }

}
