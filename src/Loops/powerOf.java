package Loops;

import java.util.Scanner;

public class powerOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, power;
        int total = 1;  // Çünkü bir sayının üssü negatif veya 0 olamaz.
        System.out.println("Enter the base number.");
        base=sc.nextInt();
        System.out.println("Enter the power number.");
        power=sc.nextInt();
//        ---USING FOR LOOP---
        for (int i=1; i<=power; i++) {
            total = total*base;
        }
        System.out.println("Outcome: "+total);
//        ---USING WHILE LOOP---
//        int i = 1;
//        while(i<=power) {
//            total*=base;
//            i++;
//        }
//        System.out.println("Outcome: "+total);
    }
}
