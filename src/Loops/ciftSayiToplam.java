package Loops;

import java.util.Scanner;

public class ciftSayiToplam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Enter a number.");
        input = sc.nextInt();
        for (int i = 0; i<=input; i++) {
            if (i%2!=0) {
                continue;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
