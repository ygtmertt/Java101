import java.util.Scanner;
public class NotOrtalaması {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matematik sınav notunu gir.");
        int mat = sc.nextInt();
        System.out.println("Fizik sınav notunu gir.");
        int fiz = sc.nextInt();
        System.out.println("Kimya sınav notunu gir.");
        int kim = sc.nextInt();
        System.out.println("Türkçe sınav notunu gir.");
        int trk = sc.nextInt();
        System.out.println("Tarih sınav notunu gir.");
        int trh = sc.nextInt();
        System.out.println("Müzik sınav notunu gir.");
        int muz = sc.nextInt();
        double ort = (double)(mat + fiz + kim + trk + trh + muz)/6;
        System.out.println("Ortalamanız "+ort);
        boolean sonuc = ort > 60;
        String durum = sonuc ? "Geçer" : "Geçmez";
        System.out.println(durum);
    }
}
