import java.util.Scanner;

public class KDV_Tutarı {
    public static void main(String[] args) {
        double kdvTutarı;
        Scanner sc = new Scanner(System.in);
        System.out.println("Para değerini giriniz.");
        int miktar = sc.nextInt();
        if(miktar<=1000 && miktar>0){
            kdvTutarı = 0.18;
        }
        else {
            kdvTutarı = 0.08;
        }
        double KDVliTutar = miktar+(miktar*kdvTutarı);
        System.out.println("KDV'li tutar: "+KDVliTutar);
        System.out.println("KDV'siz tutar: "+miktar);
        System.out.println("KDV Tutarı: "+(KDVliTutar-miktar));
    }
}
