/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

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
        String descripcion = "Este producto cuenta como una pieza de tecnológia avanzada";
        int cantidad = 20;
        double precio_unidad = 12.5;
        double costo_pedido = (cantidad * precio_unidad);
        if (cantidad > 50) {
            costo_pedido = (costo_pedido - (costo_pedido * 0.15));

        }
        System.out.printf("------Pedido------\n\nDescripción: %s\n\nCantidad: %d\n\n"
        + "Precio Unitario: %.2f\n\nCosto: %.2f\n", descripcion, cantidad, precio_unidad, costo_pedido);
    }
}
