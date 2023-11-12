/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author StarMedia
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int edad;
        double kilovatios;
        double costo;
        double planilla;
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese los kilovatios que consumió este mes");
        kilovatios = entrada.nextDouble();
        System.out.println("Ingrese el costo por hora que tienen los kilovatios");
        costo = entrada.nextDouble();
        planilla = (kilovatios * costo);
        if (edad > 65) {
            planilla = (planilla - (planilla * 0.10));
        }
        System.out.printf("Planilla de luz: %.2f", planilla);

    }
}
