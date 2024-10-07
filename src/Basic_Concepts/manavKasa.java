package Basic_Concepts;

import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double armut = 2.14,
                elma = 3.67,
                domates = 1.11,
                muz = 0.95,
                patlıcan = 5.0;
        int kilo;
        System.out.print("Armut kaç kg: ");
        kilo = sc.nextInt();
        armut = armut*kilo;
        System.out.print("Elma kaç kg: ");
        kilo = sc.nextInt();
        elma = elma*kilo;
        System.out.print("Domates kaç kg: ");
        kilo = sc.nextInt();
        domates = domates*kilo;
        System.out.print("Muz kaç kg: ");
        kilo = sc.nextInt();
        muz = muz*kilo;
        System.out.print("Patlıcan kaç kg: ");
        kilo = sc.nextInt();
        patlıcan = patlıcan*kilo;
        double total = armut+elma+domates+muz+patlıcan;
        System.out.println("Total ücret: "+total);
    }
}