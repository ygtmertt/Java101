package Condition_Statements;

import java.util.Scanner;
public class sinifGecme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat, fiz, tr, kim, muz;
        System.out.println("Matematik notunuzu giriniz.");
        mat = sc.nextInt();
        if(mat>=0 && mat<=100) {
            System.out.println("Matematik notu: "+mat);
        }
        else {
            System.out.println("Geçerli bir not giriniz.");
            mat = 0;
        }
        System.out.println("Fizik notunuzu giriniz.");
        fiz = sc.nextInt();
        if(fiz>=0 && fiz<=100) {
            System.out.println("Fizik notu: "+fiz);
        }
        else {
            System.out.println("Geçerli bir not giriniz.");
            fiz = 0;
        }
        System.out.println("Türkçe notunuzu giriniz.");
        tr = sc.nextInt();
        if(tr>=0 && tr<=100) {
            System.out.println("Türkçe notu: "+mat);
        }
        else {
            System.out.println("Geçerli bir not giriniz.");
            tr = 0;
        }
        System.out.println("Kimya notunuzu giriniz.");
        kim = sc.nextInt();
        if(kim>=0 && kim<=100) {
            System.out.println("Kimya notu: "+kim);
        }
        else {
            System.out.println("Geçerli bir not giriniz.");
            kim = 0;
        }
        System.out.println("Müzik notunuzu giriniz.");
        muz = sc.nextInt();
        if(muz>=0 && muz<=100) {
            System.out.println("Müzik notu: "+muz);
        }
        else {
            System.out.println("Geçerli bir not giriniz.");
            muz = 0;
        }
        double ortalama = (mat + fiz + tr + kim + muz) / 5;
        System.out.println("Dönem Ortalamanız: " + ortalama);
        if (ortalama >= 55) {
            System.out.println("Sınıfı " + ortalama + " not ortalamasıyla geçtiniz.");
        } else {
            System.out.println("Sınıfta " + ortalama + " not ortalamasıyla kaldınız.");
        }
    }
}
