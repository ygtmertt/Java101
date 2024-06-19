package Methods;

import java.util.Scanner;

public class ExponentialNumber {
    // Method to calculate base raised to the power of exp using recursion
    static int exponentialNumber(int base, int exp) {
        if (exp == 0) {
            return 1; // Any number raised to the power of 0 is 1
        }
        else if (exp == 1) {
            return base; // Base case for recursion
        }
        else {
            return base * exponentialNumber(base, exp - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base Number?");
        int base = sc.nextInt();
        System.out.println("Exponential Number?");
        int exp = sc.nextInt();

        // Calculate the result
        int result = exponentialNumber(base, exp);
        System.out.println(base + " raised to the power of " + exp + " is: " + result);
    }
}
