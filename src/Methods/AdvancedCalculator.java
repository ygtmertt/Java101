package Methods;

import java.util.Scanner;

public class AdvancedCalculator {
    static void plus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Until you press 0, we will continue the operation.");
        System.out.println("Enter the number:");
        int newNumber = scanner.nextInt();
        int sum = newNumber;
        while (newNumber != 0) {
            System.out.println("Enter the number:");
            newNumber = scanner.nextInt();
            sum += newNumber;
        }
        System.out.println("Calculation completed.\nAnswer: " + sum);
    }

    static void minus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Until you press 0, we will continue the operation.");
        System.out.println("Enter the number:");
        int newNumber = scanner.nextInt();
        int ans = newNumber;
        while (newNumber != 0) {
            System.out.println("Enter the number:");
            newNumber = scanner.nextInt();
            ans -= newNumber;
        }
        System.out.println("Calculation completed.\nAnswer: " + ans);
    }

    static void multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Until you press 1, we will continue the operation.");
        System.out.println("Enter the number:");
        int newNumber = scanner.nextInt();
        int ans = newNumber;
        while (newNumber != 1) {
            System.out.println("Enter the number:");
            newNumber = scanner.nextInt();
            ans *= newNumber;
        }
        System.out.println("Calculation completed.\nAnswer: " + ans);
    }

    static void divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Until you press 1, we will continue the operation.");
        System.out.println("Enter the number:");
        double newNumber = scanner.nextInt();
        double ans = newNumber;
        while (newNumber != 1) {
            System.out.println("Enter the number:");
            newNumber = scanner.nextInt();
            ans /= newNumber;
        }
        System.out.println("Calculation completed.\nAnswer: " + ans);
    }

    static void exponential() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base value.");
        int base = scanner.nextInt();
        System.out.println("Enter the exponent value");
        int exponent = scanner.nextInt();
        int ans = 1;
        while (exponent > 0) {
            ans *= base;
            exponent--;
        }
        System.out.println("Calculation completed.\nAnswer: " + ans);
    }

    static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.");
        int input = scanner.nextInt();
        int ans = 1;
        if (input == 0) {
            ans = 0;
        } else if (input < 0) {
            System.out.println("Can't compute factorials for negative numbers.");
        } else {
            for (int i = input; i > 0; i--) {
                ans *= i;
            }
        }
        System.out.println("Calculation completed.\nAnswer: " + ans);
    }

    static void modulus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for dividend:");
        int dividend = scanner.nextInt();
        System.out.println("Enter the value for divisor:");
        int divisor = scanner.nextInt();
        int answer = dividend % divisor;
        System.out.println("Calculation completed.\nAnswer: " + answer);
    }

    static void areaAndPerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for long end.");
        double longEnd = scanner.nextDouble();
        System.out.println("Enter the value for short end.");
        double shortEnd = scanner.nextDouble();
        double perimeter = 2 * shortEnd + 2 * longEnd;
        double area = longEnd * shortEnd;
        System.out.println("Calculation completed." +
                "\nArea Value: " + area +
                "\nPerimeter Value: " + perimeter);
    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                1- Addition
                2- Subtraction
                3- Multiplication
                4- Division
                5- Exponential Calculation
                6- Factorial Calculation
                7- Modulus Calculation
                8- Area and Perimeter Calculation for Rectangle
                0- Exit""";
        System.out.println("Welcome to Menu.\nPlease enter the corresponding number for the calculation.");
        System.out.println(menu);
        int choice = scanner.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Exiting program...");
                break;
            case 1:
                plus();
                menu();
                break;
            case 2:
                minus();
                menu();
                break;
            case 3:
                multiply();
                menu();
                break;
            case 4:
                divide();
                menu();
                break;
            case 5:
                exponential();
                menu();
                break;
            case 6:
                factorial();
                menu();
                break;
            case 7:
                modulus();
                menu();
                break;
            case 8:
                areaAndPerimeter();
                menu();
                break;
            default:
                System.out.println("Wrong value.");
                break;
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
