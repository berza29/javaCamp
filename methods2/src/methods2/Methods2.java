package methods2;

/**
 *
 * @author berza
 */
public class Methods2 {

    public static void main(String[] args) {
        String mesaj = "bugün hava güzel";
        String yeniMesai = sehirVer();
        System.out.println(sehirVer());
        int sayi = topla(5, 2);
        int toplam=topla2(1,5,8,6);
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void güncelle() {
        System.out.println("güncelle");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;

    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayı : sayilar) {
            toplam += sayı;

        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}
