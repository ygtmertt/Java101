import java.util.Scanner;
public class etkinlikOnerme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degree;
        System.out.println("Please enter weather degree.");
        degree = sc.nextInt();
        if (degree<5){
            System.out.println("You can go skiing.");
        }
        else if (degree>=5 && degree<15) {
            System.out.println("You can go to cinema");
        }
        else if (degree>=15 && degree<25) {
            System.out.println("You can go to picnic.");
        }
        else {
            System.out.println("You can go swimming.");
        }
    }
}
