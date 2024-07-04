package Methods;

public class PrimeNumber {

    static void isPrime(int number) {
        if (number < 2) {
            System.out.println("Asal değil."); // Not prime
            return;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Asal değil."); // Not prime
                return;
            }
        }

        System.out.println("Asal."); // Prime
    }

    public static void main(String[] args) {
        isPrime(8);
        isPrime(7); // Added an example with a prime number
    }
}
