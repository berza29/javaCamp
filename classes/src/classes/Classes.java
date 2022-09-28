/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author berza
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerManager customerManager ;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager2.Remove();
        customerManager2.Update();
    }

}
