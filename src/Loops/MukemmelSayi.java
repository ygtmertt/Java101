package Loops;

import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to check.");
        int input = sc.nextInt();
        int total = 0;
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                total += i;
            }
        }
        if (total == input) {
            System.out.println(input + " is a perfect number.");
        } else {
            System.out.println(input + " is not a perfect number.");
        }
    }
}
