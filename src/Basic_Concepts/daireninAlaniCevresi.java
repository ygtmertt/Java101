package Basic_Concepts;

import java.util.Scanner;
public class daireninAlaniCevresi {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Yarıçapı giriniz");
        int r = sc.nextInt();
        double pi = 3.14;
        double alan = pi*r*r;
        double cevre = 2*pi*r;
        System.out.println("Dairenin alanı: "+alan+"cm2");
        System.out.println("Dairenin çevresi: "+cevre+"cm");
        System.out.println("Merkez Açı Ölçüsü giriniz.");
        int a = sc.nextInt();
        double dilimAlan = (pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin alanı: "+dilimAlan+"cm2");
    }
}
