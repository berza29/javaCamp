/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arkadassayilar;

/**
 *
 * @author berza
 */
public class ArkadasSayilar {

    public static void main(String[] args) {
        int sayi1 = 50;
        int sayi2 = 80;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 0; i < sayi1; i++) {
            if (sayi1 % 2 == 0) {
                toplam1 = toplam1 + i;
            }
        }

        for (int i = 0; i < sayi2; i++) {
            if (sayi2 % 2 == 0) {
                sayi2 = sayi2 + i;
            }
        }

        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println("Sayilar arkadaştır");

        } else {
            System.out.println("Sayilar arkadaş değildirr");
        }
    }

}
