package Arrays;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word you want to check.");
        String word = scanner.nextLine();
        String[] placeholder = new String[word.length()];
        String[] reversePlaceholder = new String[word.length()];
        int index = 0;
        for (int i = 0; i <= word.length() - 1; i++) {
            placeholder[index] = String.valueOf(word.charAt(i));
            index++;
        }
        index = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            reversePlaceholder[index] = placeholder[i];
            index++;
        }
        String reverseWord = "";
        for (int i = 0; i < reversePlaceholder.length; i++) {
            reverseWord = reverseWord + reversePlaceholder[i];
        }
        if (word.equals(reverseWord)) {
            System.out.println("The word " + word + " is a palindrome string.");
        } else {
            System.out.println("The word " + word + " is not a palindrome string.");
        }
    }
}
