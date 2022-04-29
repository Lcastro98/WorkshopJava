package Exercise7;

import java.util.Scanner;

/**
 * Clase inicial del ejercicio 7
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main7 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer number;

        /**
         * Ciclo que pide un número mientras este sea menor que 0
         */
        do {
            System.out.println("Escriba un número: ");
            number = scan.nextInt();
        } while (number < 0);
        System.out.println(number);
    }
}
