package Loops;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz.");
        int num1 = s.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        int num2 = s.nextInt();
        int ebob, ekok;
        System.out.println("Ebob");
        if (num1 > num2) {
            for(int i = 1; i<=num1; i++) {
                if(num1%i==0 && num2%i==0) {
                    System.out.println(i);
                }
            }
        }
        else {
            for(int i = 1; i<=num2; i++) {
                if(num1%i==0 && num2%i==0) {
                    System.out.println(i);
                }
            }
        }
        System.out.println("Ekok");
        if(num1 > num2) {
            for(int i = 1; i<=20; i++) {
                for(int j = 1; j<=20; j++) {
                    if(num1*i==num2*j) {
                        System.out.println(num1*i);
                    }
                }
            }
        }
        else {
            for(int i = 1; i<=20; i++) {
                for(int j = 1; j<=20; j++) {
                    if(num2*i==num1*j) {
                        System.out.println(num2*i);
                    }
                }
            }
        }
    }
}
