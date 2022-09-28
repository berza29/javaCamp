/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sayibulma;

/**
 *
 * @author berza
 */
public class SayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] sayilar = new int []{1,3,5,7,9};
        int aranacak=5;
        boolean sayiMi=false;
        
        for(int sayi:sayilar){
            if(sayi==aranacak){
                sayiMi=true;
                // System.out.println("Sayi bulundu");
            
            }
        
        }
      
        if(sayiMi==true){
            System.out.println("Sayi bulundu");
        }else{
            System.out.println("Sayi bulunamadı");
        }
        
    }
    
}
