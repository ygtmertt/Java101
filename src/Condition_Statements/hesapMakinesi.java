package Condition_Statements;

import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, select;
        System.out.println("İlk sayıyı giriniz.");
        n1 = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        n2 = sc.nextInt();
        System.out.println("İşlemi seçiniz.");
        System.out.println("1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme");
        select = sc.nextInt();
        switch (select){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
