/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

/* Random walkers. Write a program RandomWalkers.java that takes two integer
command-line arguments r and trials. In each of trials independent experiments,
simulate a random walk until the random walker is at Manhattan distance r from
the starting point. Print the average number of steps. Only conditionals and loops
allowed. */

public class RandomWalkers {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[1]);
        int accum = 0;
        int steps = 0;

        for (int i = 0; i < trials; i++) {
            int x0 = 0;
            int y0 = 0;

            int x1 = 0;
            int y1 = 0;

            int r = Integer.parseInt(args[0]);

            // System.out.println("(" + x0 + ", " + y0 + ")");

            while (Math.abs(x0 - x1) + Math.abs(y0 - y1) < r) {
                double randomNumber = Math.random();
                if (randomNumber < 0.25) {
                    ++x1;
                    // System.out.println("(" + x1 + ", " + y1 + ")");
                }

                else if (randomNumber < 0.50) {
                    --x1;
                    // System.out.println("(" + x1 + ", " + y1 + ")");
                }

                else if (randomNumber < 0.75) {
                    ++y1;
                    // System.out.println("(" + x1 + ", " + y1 + ")");
                }

                else {
                    --y1;
                    // System.out.println("(" + x1 + ", " + y1 + ")");
                }
                steps++;
            }
            // System.out.println("steps = " + steps);
            accum += steps;
            steps = 0;
        }
        double averageSteps = (double) accum / trials;
        System.out.println("Average number of steps = " + averageSteps);
    }
}

