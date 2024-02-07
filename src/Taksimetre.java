import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perKm = 2.2;
        double min = 20;
        double acilis = 10;
        double total;
        int km;
        System.out.println("Yolun kaç km olduğunu yazınız.");
        km = sc.nextInt();
        total = perKm*km + 10;
        if(total>=20) {
            System.out.println("Ödeyeceğiniz tutar: "+total+"$");
        }
        else {
            System.out.println("Ödeyeceğiniz tutar: "+min+"$");
        }
    }
}
