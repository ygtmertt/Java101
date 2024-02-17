package Loops;

import java.util.Scanner;

import static java.lang.Math.pow;

public class twoPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Please enter a number.");
        input=sc.nextInt();
        for (int i=1; i<=input; i*=4) {
            if(i%4==0) {
                System.out.println(i);
            }
        }
        for (int i=1; i<=input; i*=5) {
            if(i%5==0) {
                System.out.println(i);
            }
        }
    }
}
