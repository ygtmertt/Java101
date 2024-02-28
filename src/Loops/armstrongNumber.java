package Loops;

import java.util.Scanner;

import static java.lang.Math.pow;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, originalNumber, currentDigit;
        int numberOfDigits = 0, sumOfDigits = 0;
        System.out.println("Please enter the number you want to check for being an Armstrong Number.");
        input = sc.nextInt();
        originalNumber = input;

        while (originalNumber != 0) {
            numberOfDigits++;
            originalNumber /= 10; // Fix the variable used in the loop condition
        }

        originalNumber = input; // Reset originalNumber to the initial value

        while (originalNumber != 0) {
            currentDigit = originalNumber % 10; // Use originalNumber here
            sumOfDigits += pow(currentDigit, numberOfDigits);
            originalNumber /= 10;
        }

        if (sumOfDigits != input) {
            System.out.println("Your number is not an Armstrong Number.");
        } else {
            System.out.println("Your number is an Armstrong Number.");
        }
    }
}
