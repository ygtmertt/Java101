package Arrays;

public class MaxMinFinder {
    public static void main(String[] args) {
        int[] list = {23, 98, 3, 1, 12, 7, 45, 19, 3};
        int max = list[0];
        int min = list[0];
        for (int j : list) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
