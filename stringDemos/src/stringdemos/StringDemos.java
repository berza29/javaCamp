/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringdemos;

/**
 *
 * @author berza
 */
public class StringDemos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mesaj = "bugün hava çok güzel";

        System.out.println(mesaj);
        System.out.println("eleman sayısı" + mesaj.length());
        System.out.println("5. karakter" + mesaj.charAt(4));
        System.out.println(mesaj.concat("yaşasın"));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));

    }

}
