package lesson;

public class Blocks {
    public static void main(String[] args) {
        // 1. print one char AND move the caret to the new line
        System.out.println("*");

        // 2. print one char AND DO NOT move the caret to the new line
        System.out.print("*");

        // 3. just move the caret to the new line
        System.out.println();

        // 4. print more than one in one line
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 5. compose iterations
        System.out.println("----");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 6. comparing
        int x = 5;
        int y = 10;
        int z = x * y;
        if (z > 20) {
            System.out.println("greater than 20");
        } else {
            System.out.println("less than 20");
        }

    }
}
