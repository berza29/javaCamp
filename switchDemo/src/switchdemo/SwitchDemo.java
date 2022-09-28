/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchdemo;

/**
 *
 * @author berza
 */
public class SwitchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {

            case 'A':
                System.out.println("A ile Geçtiniz ");
                break;
            case 'B':
            case 'C':
                System.out.println("C ile Geçtiniz ");
                 break;
            case 'D':
                System.out.println("D ile Geçtiniz ");
                 break;
        }
    }

}
