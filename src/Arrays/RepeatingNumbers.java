package Arrays;

import java.util.Arrays;

public class RepeatingNumbers {
    public static void main(String[] args) {
        int[] list = {12, 6, 1, 44, 12, 66, 98, 23, 1, 24, 56, 78, 6, 65, 56};
        int[] duplicates = new int[list.length];
        int index = 0;
        Arrays.sort(list); //If we sort array then check duplicates, duplicates in the array will come after one another.

        for (int i=0; i<list.length-1; i++) {
            if(list[i]==list[i+1]) {
                duplicates[index] = list[i];
                index++;
            }
        }


        // printing out the arrays to check our work.
        System.out.println(Arrays.toString(list));
        System.out.println("**************");
        System.out.println(Arrays.toString(duplicates));
    }
}
