/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniprojeasalmi;

/**
 *
 * @author berza
 */
public class MiniProjeAsalMi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayi = 23;
        boolean isPrime = true;

        if (sayi == 0) {
            System.out.println("sayı aasal değildir");
        }

        if (sayi < 0) {
            System.out.println("sayı geçersizdir");
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("sayı asaldır");
        } else {
            System.out.println("sayı asal değil");
        }

    }

}
