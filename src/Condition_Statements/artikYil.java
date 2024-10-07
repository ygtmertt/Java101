package Condition_Statements;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yıl;
        System.out.println("Artık yıl olup olmadığını görmek için lütfen bir yıl giriniz.");
        yıl = sc.nextInt();
        if(yıl%100==0) {
            if(yıl%400==0) {
                System.out.println("Artık yıl.");
            }
            else {
                System.out.println("Artık yıl değil.");
            }
        }
        else {
            if (yıl%4==0) {
                System.out.println("Artık yıl.");
            }
            else {
                System.out.println("Artık yıl değil.");
            }
        }
    }
}
