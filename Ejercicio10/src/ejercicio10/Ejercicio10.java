/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author utpl
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean operando1 = 50>100;
        boolean operando2 = true;
        boolean operando3 = false;
        boolean operando4 = 2>=2;
        boolean valorC = operando1 && operando2 || operando3 || operando4;
        
        System.out.print(valorC);
    }
    
}
