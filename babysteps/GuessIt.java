// package baby-steps;
package babysteps;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessIt {
    public static void main(String[] args) {
        // Instantiate Scanner
        Scanner input = new Scanner(System.in);
        // Instantiate Generator
        RandomGenerator generator = RandomGenerator.getDefault();

        int secretNumber = generator.nextInt(100);
        int tries = 50;
        boolean won = false;

        while (tries > 0) {
            System.out.print("Guess the Number between 0 & 100: ");
            int guess = input.nextInt();

            if (guess == secretNumber) {
                System.out.println("Yay, You Won!!");
                won = true;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }

            tries--;
        }

        if (!won) {
            System.out.println("The number was: " + secretNumber);
            System.out.println("Maybe next time.....");
        }
        
        input.close();
    }
}
