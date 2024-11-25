import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vFizik, vTurkce, vKimya, vTarih, vMuzik;

        System.out.println("Fizik notunu giriniz");
        vFizik = input.nextInt();

        System.out.println("Türkçe notunu giriniz");
        vTurkce = input.nextInt();

        System.out.println("Kimya notunu giriniz");
        vKimya = input.nextInt();

        System.out.println("Tarih notunu giriniz");
        vTarih = input.nextInt();

        System.out.println("Müzik notunu giriniz");
        vMuzik = input.nextInt();

        float sonuc = (vFizik + vTurkce + vKimya + vTarih + vMuzik) / 5;

        String durum;
        durum = (sonuc > 60) ? "Geçtiniz" : "Kaldınız";

        System.out.println(durum);

    }
}
