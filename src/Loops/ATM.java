package Loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 123098;
        double balance = 4859.97;
        int attempts = 3;
        String userName = "Yiğit Mert";
        System.out.println("Please enter your username.");
        String userNameAttempt = sc.nextLine();
        System.out.println("Please enter your password.");
        int passwordAttempt = sc.nextInt();

        if((password != passwordAttempt) || (userName.equals(userNameAttempt)==false)) {
            while(attempts > 0) {
                System.out.println("You have entered a wrong password or user name." +
                        "\nYou have "+attempts+" attempts left.");
                break;
            }
            attempts--;
            if(attempts==0) {
                System.out.println("You have no more attempts left. Contact an employee");
            }
        }
        else {
            System.out.println("Hello, " + userName + "!");
            System.out.println("Welcome to YOM Bank!\n" +
                    "Which action would you like to perform?");
            System.out.println("1-View balance\n" +
                    "2-Make deposit\n" +
                    "3-Make withdrawal\n" +
                    "4-Log out");
            switch(sc.nextInt()) {
                case 1:
                    System.out.println("Your balance is "+balance+"$");
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit in your account.");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your updated balance is "+balance+"$");
                    break;
                case 3:
                    System.out.println("Enter the amount you want to withdraw from your account.");
                    int withdraw = sc.nextInt();
                    balance -= withdraw;
                    System.out.println("Your updated balance is "+balance+"$");
                case 4:
                    System.out.println("You have logged out of your account.");
            }
        }
    }
}
