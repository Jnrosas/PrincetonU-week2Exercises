/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

/* Generalized harmonic numbers. Write a program GeneralizedHarmonic.java that
takes two integer command-line arguments n and r and uses a for loop to compute
the nth generalized harmonic number of order r. Only conditionals and loops allowed */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double h = 0.0;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                double v = (1 / Math.pow(i, r));
                h += v;
            }
            System.out.println(h);
        }
        else System.out.println("n should be a positive int");
    }
}
