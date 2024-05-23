package Loops;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ebob = 0;
        int ekok = 0;
        System.out.print("Birinci sayıyı giriniz.");
        int num1 = s.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        int num2 = s.nextInt();
        System.out.println("Sayıların En Büyük Ortak Böleni");
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println(ebob);


        System.out.println("Sayıların En Küçük Ortak Katı");
        for(int i = 1; i<=num1*num2; i++) {
            if(i%num1==0 && i%num2==0) {
                ekok=i;
                break;
            }
        }
        System.out.println(ekok);
    }
}
