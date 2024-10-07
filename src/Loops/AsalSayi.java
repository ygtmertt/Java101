package Loops;

public class AsalSayi {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki Asal Sayılar:");

        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asal = true;  // Başta sayının asal olduğunu kabul edelim. (2 asal sayıdır)
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.println(sayi + " ");
            }
        }
    }
}
