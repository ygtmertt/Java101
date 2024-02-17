package Loops;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1;
        int no2;
        int total1=1;
        int total2=1;
        int total3=1;
        System.out.println("Kombinasyonu alınacak sayıyı girin.");
        no1=sc.nextInt();
        System.out.println("Hangi sayı ile kombinasyonu alınacağını seçin.");
        no2=sc.nextInt();
        // C(n,r) = n!/(r!*(n-r)!)
        for (int i=1; i<=no1; i++) {
            total1=total1*i;
        }
        int c_no1=total1;

        for (int i=1; i<=no2; i++) {
            total2=total2*i;
        }
        int c_no2=total2;

        for (int i=1; i<=(no1-no2); i++) {
            total3=total3*i;
        }
        int combination = total1/(total2*total3);
        System.out.println("Kombinasyon: "+combination);
    }
}
