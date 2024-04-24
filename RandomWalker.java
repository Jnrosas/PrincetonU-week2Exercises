/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

/* Write a program RandomWalker.java that takes an integer command-line argument r
and simulates the motion of a random walk until the random walker is at Manhattan
distance r from the starting point. Print the coordinates at each step of the
walk (including the starting and ending points), treating the starting point as
(0, 0). Also, print the total number of steps taken. Only conditionals and
loops allowed. */

public class RandomWalker {
    public static void main(String[] args) {
        int x0 = 0;
        int y0 = 0;

        int x1 = 0;
        int y1 = 0;

        int r = Integer.parseInt(args[0]);
        int steps = 0;

        System.out.println("(" + x0 + ", " + y0 + ")");

        while (Math.abs(x0 - x1) + Math.abs(y0 - y1) < r) {
            double randomNumber = Math.random();
            if (randomNumber < 0.25) {
                ++x1;
                System.out.println("(" + x1 + ", " + y1 + ")");
            }

            else if (randomNumber < 0.50) {
                --x1;
                System.out.println("(" + x1 + ", " + y1 + ")");
            }

            else if (randomNumber < 0.75) {
                ++y1;
                System.out.println("(" + x1 + ", " + y1 + ")");
            }

            else {
                --y1;
                System.out.println("(" + x1 + ", " + y1 + ")");
            }
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}
