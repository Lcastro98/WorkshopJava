package Exercise9;

import java.util.Scanner;

/**
 * Clase inicial del ejercicio 9
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main9 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = "La sonrisa sera la mejor arma contra la tristeza";
        text = text.replace("a", "e");

        System.out.println("Escriba una frase");
        String consolaText = scan.nextLine();

        System.out.println(text + " " + consolaText);
    }
}
