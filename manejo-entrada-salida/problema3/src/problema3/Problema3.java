/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author StarMedia
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costoxmin;
        double minutos;
        double total;
        
        System.out.println("Ingrese el costo por minuto telefonico");
        costoxmin = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de minutos consumidos este mes");
        minutos = entrada.nextDouble();
        total = costoxmin * minutos;
        
        System.out.printf("El valor total a pagar de su planilla telefonica es: %.2f\n", total);
    }
    
}
