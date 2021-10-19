import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri Oluştur
        double r,pi=3.14,a;

        //Kullanıcıdan Verileri al
        Scanner girdi= new Scanner(System.in);

        System.out.println("Dairenin Yarı Çapını Giriniz: ");
        r=girdi.nextDouble();

        System.out.println("Merkez Açısının Ölçüsünü Giriniz: ");
        a=girdi.nextDouble();

        //Sonucu Yazdır
        double alan=pi*r*r;
        System.out.println("Dairenin Alanı: " +alan);

        double cevre=2*pi*r;
        System.out.println("Dairenin Çevresi: "+cevre);

        double diliminAlani=(pi*(r*r)*a)/360;
        System.out.println("Daire diliminin Alanı: "+diliminAlani);

    }
}
