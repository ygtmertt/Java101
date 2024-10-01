package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100);
        int attempts = 5;
        int[] wrongAttempts = new int[5];
        int index = 0;

        System.out.println(number);
        attempts--;
        while (attempts >= 0) {
            System.out.println("Take a guess!");
            int guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("Congratulations!!! Your guess was right. The mystery number was " + number);
                break;
            } else if (guess != number && attempts != 1) {
                wrongAttempts[index] = guess;
                index++;
                System.out.println("You guessed wrong. You have " + attempts + " attempts left.");
            } else {
                wrongAttempts[index] = guess;
                index++;
                System.out.println("You guessed wrong. Careful now, this is your last chance!");
            }
            attempts--;
        }
        if (attempts < 0) {
            System.out.println("Unfortunately you couldn't guess right. Mystery number was " + number + " and your guesses were" + Arrays.toString(wrongAttempts));
            System.out.println("Better luck next time!");
        }
    }
}
