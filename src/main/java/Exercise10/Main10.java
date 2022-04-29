package Exercise10;

import java.util.Scanner;

/**
 * Clase inicial del ejercicio 10
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main10 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String phrase = scan.nextLine();
        phrase = phrase.replace(" ", "");
        System.out.println(phrase);
    }
}
