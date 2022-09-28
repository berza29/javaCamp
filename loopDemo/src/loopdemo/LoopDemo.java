/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopdemo;

/**
 *
 * @author berza
 */
public class LoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //for
        for (int i = 2; i < 10; i++) {
            System.out.println(i);
        }
        
        //while
        int i = 2;

        while (i < 10) {
            System.out.println(i);
            i += 2;
        }

       
        //do-while
         int j = 100;
        do {
            System.out.println(j);
            j += 50;
        }
        while (j < 10);
          System.out.println("dongü bitti");

    }

}
