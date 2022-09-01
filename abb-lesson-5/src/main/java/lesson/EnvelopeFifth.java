package lesson;

public class EnvelopeFifth {
    /*
  01234567...

0 ************************
1 ************************
2 **  *              *  **
3 **     *        *     **
4 **       *    *       **
5 **         X          **
6 **      *      *      **
7 **   *            *   **
8 ************************
9 ************************

 *
 * */

    public static void main(String[] args) {
        int width = 23;
        int height = 13;
        String result = showEnvelope(width,height);
        System.out.println(result);
    }

    private static String showEnvelope(int width, int height) {
        /** logic / process */
        double k = (double) width / height;

        final int firstRow = 0;
        final int firstCol = 0;
        final int lastRow = height - 1;
        final int lastCol = width - 1;

        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == lastRow / 2 && col == lastCol / 2)
                    sb.append("X");
                else if (row == firstRow ||                   // firstRow
                        row == firstRow + 1 ||
                        col == firstCol ||
                        col == firstCol + 1 ||                   // firstCol
                        col == lastCol ||                    // lastCol
                        row == lastRow ||                     // firstCol
                        col == lastCol - 1 ||                    // lastCol
                        row == lastRow - 1 ||                    // lastRow
                        col == Math.round(row * k) ||        // diagonal 1
                        col == lastCol - Math.round(row * k) // diagonal 2
                ) sb.append("*");
                else sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
