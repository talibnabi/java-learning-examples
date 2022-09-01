package lesson.box;

import lesson.box.Box;

import java.util.Scanner;

public class BoxApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] numbers1 = getNumbers(in);
        int[] numbers2 = getNumbers(in);

        Box box1 = new Box(numbers1[0], numbers1[1], numbers1[2]);
        Box box2 = new Box(numbers2[0], numbers2[1], numbers2[2]);

        String result = box1.compare(box2) ?
                String.format("The box %s fits into the box %s\n", box1, box2) :
                String.format("The box %s doesn't fit into the box %s\n", box1, box2);

        System.out.println(result);
    }

    public static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static int[] getNumbers(Scanner in) {
        String line = in.nextLine();
        String[] items = line.split(" ");
        int[] a = {
                toInt(items[0]),
                toInt(items[1]),
                toInt(items[2])
        };
        return a;
    }

}
