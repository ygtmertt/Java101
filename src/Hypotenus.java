import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Hypotenus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Please enter the value for a.");
        a = sc.nextInt();
        System.out.println("Please enter the value for b.");
        b = sc.nextInt();
        int hypotenus = (int) sqrt((a * a) + (b * b));
        System.out.println("Hypotenus is: " + hypotenus);
        int perimeter = a + b + hypotenus;
        System.out.println("Perimeter is: " + perimeter);
        int halfPer = perimeter / 2;
        int area = (int) sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - hypotenus));
        System.out.println("Area is: " + area);
    }
}
