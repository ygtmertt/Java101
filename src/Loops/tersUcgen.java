package Loops;

import java.util.Scanner;

public class tersUcgen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows do you want?");
        int rows = sc.nextInt();

        for (int i = rows; i > 0; i--) {
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
