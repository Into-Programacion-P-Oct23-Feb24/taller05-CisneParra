/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author StarMedia
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double hijo1;
        double hijo2;
        double hijo3;
        double total;
        
        System.out.println("Ingrese gastos del hijo 1");
        hijo1 = entrada.nextDouble();
        System.out.println("Ingrese gastos del hijo 2");
        hijo2 = entrada.nextDouble();
        System.out.println("Ingrese gastos del hijo 3");
        hijo3 = entrada.nextDouble();
        total = hijo1 + hijo2 + hijo3;
        System.out.printf("El total de gastos de los 3 hijos es: %.2f\n", total);
    }
    
}
