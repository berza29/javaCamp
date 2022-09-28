/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesliharf;

/**
 *
 * @author berza
 */
public class SesliHarf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf) {

            case 'A':
            case 'I':
            case 'O':
            case 'u':
                    System.out.println("Kalın sesli");
                    break;
                    
            default:
                System.out.println("ince sesli sesli");
                   
        }
    }

}
