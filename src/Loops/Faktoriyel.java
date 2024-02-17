package Loops;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int total=1;
        System.out.println("Lütfen faktöriyelini almak istediğiniz sayıyı giriniz.");
        input=sc.nextInt();
        for (int i=1; i<=input; i++){
            total=total*i;
        }
        System.out.println(total);
    }
}
