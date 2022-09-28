/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recapdemo2;

/**
 *
 * @author berza
 */
public class RecapDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] myList = {1.5, 2.8, 9.3};
        double total = 0;
        double max=myList[0];
        for (double number : myList) {
            
            if(max<number){
                max=number;
            }
            System.out.println(number);
          
            total = total + number;
              
            System.out.println("total" + total);
             System.out.println("max" + max);

        }
    }

}
