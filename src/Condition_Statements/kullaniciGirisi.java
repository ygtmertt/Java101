package Condition_Statements;

import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, password;
        String defaultPassword = "parola123";
        System.out.println("Please enter the username.");
        userName = sc.nextLine();
        System.out.println("Please enter your password.");
        password = sc.nextLine();
        if(userName.equals("ygtmertt") && password.equals(defaultPassword)){
            System.out.println("Başarıyla giriş yaptınız.");
        } else if (!userName.equals("ygtmertt") && password.equals("parola123")) {
            System.out.println("Your username is incorrect.");
        } else if (userName.equals("ygtmertt") && !password.equals("parola123")) {
            System.out.println("Your password is incorrect. If you want to change it, enter 1.");
            if(sc.nextInt()==1){
                System.out.println("Please enter your new password.");
                defaultPassword = sc.nextLine();
                System.out.println("New password has been set.");
            } else if (sc.nextInt() != 1) {
                System.out.println("Try your password again.");
            }
        } else {
            System.out.println("Both you username and password are wrong.");
        }
    }
}
