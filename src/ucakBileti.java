import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km, age, ticketType;
        double price;
        double perKm = 0.1;
        System.out.println("Please enter your age.");
        age = sc.nextInt();
        System.out.println("Please enter how far your final destination is.");
        km = sc.nextInt();
        System.out.println("Please specify your ticket ticketType.\n1. One-Way\n2. Two-Way");
        ticketType = sc.nextInt();
        if (age<0 || km<0) {
            System.out.println("Invalid values.");
        }
        else {
            if(age<=12) {
                price = (km*perKm)/2;
                if(ticketType==2) {
                    price=price-price/5;
                }
                else {
                    price=price;
                }
                System.out.println("Total ticket price: "+price+"$");
            }
            else if(age>=12 && age<=24) {
                price = (km*perKm)-(km*perKm)/10;
                if(ticketType==2) {
                    price=price-price/5;
                }
                else {
                    price=price;
                }
                System.out.println("Total ticket price: "+price+"$");}
            else if(age>65) {
                price = (km*perKm)-(km*perKm)*0.3;
                if(ticketType==2) {
                    price=price-price/5;
                }
                else {
                    price=price;
                }
                System.out.println("Total ticket price: "+price+"$");            }
            else {
                price = km*perKm;
                if(ticketType==2) {
                    price=price-price/5;
                }
                else {
                    price=price;
                }
                System.out.println("Total ticket price: "+price+"$");            }
        }
    }
}
