package Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many steps of Fibonacci Series do you want?");
        int steps = sc.nextInt();
        int num1=0;
        int num2=1;
        if(steps<=2 && steps>0) {
            System.out.println(num1);
            System.out.println(num2);
        }
        else {
            System.out.println(num1);
            System.out.println(num2);
            for(int i = 2; i < steps; i++) {
                int next = num1+num2;
                System.out.println(next);
                num1 = num2;
                num2 = next;
            }
        }
    }
}
