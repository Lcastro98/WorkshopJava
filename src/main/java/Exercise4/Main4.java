package Exercise4;

import java.util.Scanner;

/**
 * Clase inicial del ejercicio 4
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main4 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        Float priceProduct = scan.nextFloat();

        IVA iva = new IVA(priceProduct);
        System.out.println("El precio final del producto con IVA es: " + iva.priceTotal());
    }
}