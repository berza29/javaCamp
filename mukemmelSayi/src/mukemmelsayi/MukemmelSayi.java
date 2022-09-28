/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mukemmelsayi;

/**
 *
 * @author berza
 */
public class MukemmelSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sayi=10;
        int total=0;
        
        for(int i=1;i<sayi;i++){
            if(sayi%i ==0){
                total=total+i;
            }
        }
        if(sayi==total){
            System.out.println("SAYI  MÜKEMMEL SAYIDIR");
        }else{
            System.out.println("SAYI  MÜKEMMEL SAYI değildir");
        }
    }
    
}
