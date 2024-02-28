package Loops;

import java.util.Scanner;

public class harmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you want to check for being a Harmonic Number.");
        int input = sc.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= input; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Answer is: " + sum);
    }
}
