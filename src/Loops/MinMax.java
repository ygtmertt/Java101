package Loops;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxVal;
        int minVal;
        int promptNo;
        int input;

        System.out.println("How many numbers will you enter?");
        promptNo = sc.nextInt();

        System.out.println("Enter number: ");
        input = sc.nextInt();
        maxVal = input;
        minVal = input;

        for (int i = promptNo; i > 1; i--) {
            System.out.println("Enter number: ");
            input = sc.nextInt();

            if (input > maxVal) {
                maxVal = input;
            }

            if (input < minVal) {
                minVal = input;
            }
        }

        System.out.println("Max value: " + maxVal);
        System.out.println("Min value: " + minVal);

    }
}
