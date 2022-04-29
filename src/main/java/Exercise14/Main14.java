package Exercise14;

import java.util.Scanner;

/**
 * Clase inicial del ejercicio 14
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main14 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        Integer number = scan.nextInt();

        // Imprime los números desde el número digitado hasta el 1000 de 2 en 2
        while (number <= 1000) {
            System.out.println(number);
            number = number + 2;
        }
    }
}
