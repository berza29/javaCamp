/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classeswithattributes;

/**
 *
 * @author berza
 */
public class ClassesWithAttributes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p = new Product();
        p.setName("laptop");
        p.setId(1);
        p.setDescription("Lenovo Laptop");
        p.setPrice(5000);
        p.setStockAmount(100);
        
        ProductManager pm = new ProductManager();
        pm.Add(p);
        System.out.println(p.getKod());
        
        
    }
    
}
