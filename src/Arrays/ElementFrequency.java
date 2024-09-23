package Arrays;

import java.util.Arrays;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {34, 56, 8, 56, 8, 23, 34, 12, 23, 12, 56, 8, 11, 12, 23, 23, 11, 23};

        System.out.println("Array: " + Arrays.toString(arr)); // Print the array

        for (int i = 0; i < arr.length; i++) {
            int count = 1; // Start count at 1 for the element itself
            boolean alreadyCounted = false; // Flag to check if element was already counted

            // Check if the element has already been counted
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) { // If not already counted, proceed to count it
                // Count occurrences of the current element
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " has " + count + " occurrences in the array.");
            }
        }
    }
}