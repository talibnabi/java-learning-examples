package lesson;

public class Iteration {
    public static void main(String[] args) {
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
}
