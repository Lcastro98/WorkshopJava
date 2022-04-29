package Exercise12;

import java.util.Scanner;

/**
 * Clase inicial del ejercicio 12
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main12 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba la primera palabra");
        String word1 = scan.nextLine();
        System.out.println("Escriba la segunda palabra");
        String word2 = scan.nextLine();

        if (word1.equals(word2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras no son iguales");
        }
    }
}
