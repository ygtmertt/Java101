package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array.");
        int elementNo = scanner.nextInt();
        int[] array = new int[elementNo];
        for (int i = 0; i < elementNo; i++) {
            System.out.println("Element #" + (i + 1) + ":\t");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
