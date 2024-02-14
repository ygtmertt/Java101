import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Please enter your birth year to find out your zodiac animal.");
        year = sc.nextInt();
        switch (year%12) {
            case 0:
                System.out.println("Your zodiac animal is the Monkey.");
                break;
            case 1:
                System.out.println("Your zodiac animal is the Rooster.");
                break;
            case 2:
                System.out.println("Your zodiac animal is the Dog.");
                break;
            case 3:
                System.out.println("Your zodiac animal is the Pig.");
                break;
            case 4:
                System.out.println("Your zodiac animal is the Rat.");
                break;
            case 5:
                System.out.println("Your zodiac animal is the Ox.");
                break;
            case 6:
                System.out.println("Your zodiac animal is the Tiger.");
                break;
            case 7:
                System.out.println("Your zodiac animal is the Rabbit.");
                break;
            case 8:
                System.out.println("Your zodiac animal is the Dragon.");
                break;
            case 9:
                System.out.println("Your zodiac animal is the Snake.");
                break;
            case 10:
                System.out.println("Your zodiac animal is the Horse.");
                break;
            case 11:
                System.out.println("Your zodiac animal is the Sheep.");
                break;
        }
    }
}
