package Loops;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the diamond (must be an odd number): ");
        int height = scanner.nextInt();

        if (height % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        int spaceCount = height / 2;
        int starCount = 1;

        // Creating the top half of the diamond
        for (int i = 0; i < height / 2 + 1; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaceCount--;
            starCount += 2;
        }

        // Creating the bottom half of the diamond
        spaceCount = 1;
        starCount = height - 2;
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaceCount++;
            starCount -= 2;
        }
    }
}


