package Loops;

import java.util.Scanner;

public class tekSayiToplam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int total = 0;
        do {
            System.out.println("Please enter a number.");
            input = sc.nextInt();
            if(input%2==0 && input%4==0) {
                total+=input;
            }
            else {
                continue;
            }
        }
        while (input%2==0);
        System.out.println("Total of numbers that divide with 2 or 4 is: "+total);
    }
}
