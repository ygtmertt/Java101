import java.util.Scanner;

public class hackerrankChallenge_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Enter a number to check whether it's weird or not.");
        input = sc.nextInt();
        if (input>100 || input<1) {
            System.out.println("Enter a number between 1 and 100");
        }
        else {
            if (input%2 != 0) {
                System.out.println("Weird.");
            }
            else {
                if(input>=2 && input<=5) {
                    System.out.println("Not Weird.");
                }
                else if (input>=6 && input<=20) {
                    System.out.println("Weird.");
                }
                else {
                    System.out.println("Not Weird.");
                }
            }
        }
    }
}