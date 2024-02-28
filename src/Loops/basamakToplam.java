package Loops;

import java.util.Scanner;

public class basamakToplam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number.");
        int num = sc.nextInt();
        int numberOfDigits=0;
        int sumOfDigits=0;
        while(num>0) {
            sumOfDigits+=num%10;
            numberOfDigits++;
            num/=10;
        }
        System.out.println("Sum of all digits: "+sumOfDigits);
        System.out.println("Number of digits: "+numberOfDigits);
    }
}
