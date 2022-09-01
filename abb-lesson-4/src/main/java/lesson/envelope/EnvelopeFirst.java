package lesson.envelope;

public class EnvelopeFirst {
    public static void main(String[] args) {
        showEnvelope();
    }

    private static void showEnvelope() {
        /** input data */
        int height = 8;
        int width = 22;

        /** logic / process is coupled with the output */
        double k = (double) width / height;

        final int firstRow = 0;
        final int firstCol = 0;
        final int lastRow = height - 1;
        final int lastCol = width - 1;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == firstRow ||                   // firstRow
                        col == firstCol ||                   // firstCol
                        col == lastCol ||                    // lastCol
                        row == lastRow ||                     // lastRow
                        col == Math.round(row * k) ||        // diagonal 1
                        col == lastCol - Math.round(row * k) // diagonal 2
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
