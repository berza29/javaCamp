/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

/**
 *
 * @author berza
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ogrenci1 = "derin";
        String ogrenci2 = "ahmet";
        String ogrenci3 = "berza";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("------------------------");

        String[] ogrenciler = new String[3];
                ogrenciler [0]="derin";
                ogrenciler [1]="Ahmet";
                ogrenciler [2]="berza";
                
                for(int i =0;i<ogrenciler.length;i++)
                {
                    System.out.println(ogrenciler[i]);
                }
                
                 for(String ogrenci: ogrenciler)
                {
                    System.out.println(ogrenciler);
                }
       
    }

}
