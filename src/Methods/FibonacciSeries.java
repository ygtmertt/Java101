package Methods;

import java.util.Scanner;

public class FibonacciSeries {
    // f(n) = f(n-1) + f(n-2) is the main idea behind the method.
    static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits for Fibonacci series.");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
