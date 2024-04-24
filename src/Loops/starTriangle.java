package Loops;

import java.util.Scanner;

public class starTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int rows = sc.nextInt();
        for (int stars = 1; stars <= rows; stars++) {
            for (int spaces = 1; spaces <= rows-stars; spaces++) {
                System.out.print(" ");
            }
            for (int rightSideStars = 1; rightSideStars <= 2*stars-1; rightSideStars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
