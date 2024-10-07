package Basic_Concepts;

import java.util.Scanner;

public class takingInputs {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name.");
        name = sc.nextLine();
        System.out.println("Your name is "+name);
    }
}
