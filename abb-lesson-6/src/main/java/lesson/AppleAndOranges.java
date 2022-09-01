package lesson;

import java.util.List;

public class AppleAndOranges {
    private static int[] convertToArray(List<Integer> xs) {
        return xs.stream().mapToInt(a -> a).toArray();
    }

    private static boolean inTheRange(int pos, int l, int r) {
        return pos >= l && pos <= r;
    }

    public static void countApplesAndOranges(
            int s, // house position L
            int t, // house position R
            int a, // apple position
            int b, // orange position
            List<Integer> apples0, // apples distances
            List<Integer> oranges0 // oranges distances
    ) {
        int ac = 0; // non-final
        int oc = 0; // non-final
        // everything else is final
        final int[] apples = convertToArray(apples0);
        final int[] oranges = convertToArray(oranges0);
        // count apples
        for (int i = 0; i < apples.length; i++) {
            final int pos = a + apples[i];
            if (inTheRange(pos, s, t)) ac++;
        }
        // count oranges
        for (int orange : oranges) {
            final int pos = b + orange;
            if (inTheRange(pos, s, t)) oc++;
        }
        System.out.println(ac);
        System.out.println(oc);
    }

    public static void main(String[] args) {
    }

}
