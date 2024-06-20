package Methods;

import java.util.Scanner;

public class PalindromeNumbers {

    static void isPalindrome(int num) {
        int temp = num; // Because we need the actual number to compare at the end, we don't alter the original number.
        int backwards = 0;
        int last;
        while(temp!=0) {
            System.out.println("Number ==> "+temp);
            last = temp%10;
            System.out.println("Last digit ==> "+last);
            backwards = (backwards*10)+last;
            System.out.println("Updated number ==> "+backwards);
            temp/=10;
        }
        if (backwards == num) {
            System.out.println("It is a Palindrome.");
        }
        else {
            System.out.println("It's not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you want to check for being a Palindrome Number.");
        int input = sc.nextInt();
        isPalindrome(input);
    }
}
