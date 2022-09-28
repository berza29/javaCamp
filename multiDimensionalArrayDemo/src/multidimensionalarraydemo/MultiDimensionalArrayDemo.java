/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarraydemo;

/**
 *
 * @author berza
 */
public class MultiDimensionalArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] sehirler= new String[3][3];
        
        sehirler [0][0] ="hatay";
        sehirler [0][1] ="adana";
        sehirler [0][2] ="antep";
        sehirler [1][0] ="ankara";
        sehirler [1][1] ="istanbul";
        sehirler [1][2] ="izmir";
        sehirler [2][0] ="konya";
        sehirler [2][1] ="antalya";
        sehirler [2][2] ="urfa";
        
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
        
    }
    
}
