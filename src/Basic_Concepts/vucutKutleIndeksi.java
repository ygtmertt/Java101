package Basic_Concepts;

import java.util.Scanner;
public class vucutKutleIndeksi {
    public static void main(String[] args) {
        double boy, kilo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen boyunuz metre cinsinden giriniz.");
        boy = sc.nextDouble();
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz.");
        kilo = sc.nextDouble();
        double indeks = kilo/(boy*boy);
        System.out.println("Vücut kitle İndeksiniz: "+indeks);
    }
}
