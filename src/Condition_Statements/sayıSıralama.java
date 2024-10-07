package Condition_Statements;

import java.util.Scanner;
public class sayıSıralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Lütfen birinci sayıyı giriniz.");
        n1 = sc.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz.");
        n2 = sc.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz.");
        n3 = sc.nextInt();
        if(n1>n2 && n1>n3) {
            System.out.print(n1+" ");
            if (n2>n3) {
                System.out.println(n2+" "+n3);
            }
            else {
                System.out.println(n3+" "+n2);
            }
        }
        else if (n2>n1 && n2>n3) {
            System.out.print(n2+" ");
            if(n1>n3) {
                System.out.println(n1+" "+n3);
            }
            else {
                System.out.println(n3+" "+n1);
            }
        }
        else {
            System.out.print(n3+" ");
            if (n1>n2) {
                System.out.println(n1+" "+n2);
            }
            else {
                System.out.println(n2+" "+n1);
            }
        }
    }
}
