package lesson.envelope;

public class EnvelopeThird {
    public static void main(String[] args) {
        final int width = 22;
        final int height = 8;
        String result = showEnvelope(width, height);
        System.out.println(result);
    }

    private static String showEnvelope(int width, int height) {
        double k = (double) width / height;

        final int firstRow = 0;
        final int firstCol = 0;
        final int lastRow = height - 1;
        final int lastCol = width - 1;

        StringBuilder result = new StringBuilder();
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == firstRow ||                   // firstRow
                        col == firstCol ||                   // firstCol
                        col == lastCol ||                    // lastCol
                        row == lastRow ||                    // lastRow
                        col == Math.round(row * k) ||        // diagonal 1
                        col == lastCol - Math.round(row * k) // diagonal 2
                )
                    result.append("*");
                else result.append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
