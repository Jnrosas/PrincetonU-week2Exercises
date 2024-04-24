/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

/* Band matrices. Write a program BandMatrix.java that takes two integer
command-line arguments n and width and prints an n-by-n pattern like the ones
below, with a zero (0) for each element whose distance from the main diagonal
is strictly more than width, and an asterisk (*) for each entry that is not, and
two spaces between each 0 or *. Only conditionals and loops allowed */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != 0) {
                    System.out.print(" ");
                }
                if (Math.abs(j - i) > width) {
                    System.out.print("0");
                }
                else {
                    System.out.print("*");
                }
                if (j != n) System.out.print(" ");
            }
            System.out.println();
        }

    }
}
