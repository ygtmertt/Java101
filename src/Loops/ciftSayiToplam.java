package Loops;

import java.util.Scanner;

public class ciftSayiToplam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        int input;
        System.out.println("Bir sayı girin.");
        input = sc.nextInt();
        for (int i=0; i<=input; i++) {
            if(i%3==0 && i%4==0) {
                sum+=i;
                count++;
            }
            else {
                continue;
            }
        }
        if (count>0) {
            double ort = sum/count;
            System.out.println("Girdiğiniz sayıdan 0'a kadar 3'e ve 4'e kalansız bölünen sayıların ortalaması: "+ort);
        }
        else {
            System.out.println("Girdiğiniz sayıdan 0'a kadar 3'e ve 4'e kalansız bölünen sayı bulunamamıştır.");
        }
    }
}
