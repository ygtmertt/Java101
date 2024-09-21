package Arrays;

import java.util.Arrays;

public class HarmonicAverage {
    public static void main(String[] args) {
        double[] list = {6, 7, 21, 3, 14, 8};
        Arrays.sort(list);
        double sum = 0;
        for (double j : list) {
            sum += 1 / j;
        }
        System.out.println(list.length / sum);
    }
}
