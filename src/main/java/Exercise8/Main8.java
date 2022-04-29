package Exercise8;

import java.util.Scanner;


/**
 * Clase inicial del ejercicio 8
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main8 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NormalString normal = new NormalString();

        System.out.println("Escribe un día de la semana");
        String day = scan.nextLine();
        day = normal.cleanString(day);

        /**
         * Determina si el día digitado es laboral o no
         */
        switch (day) {
            case "sabado", "domingo" -> {
                System.out.println("No es día laboral");
            }
            case "lunes", "martes", "miercoles", "jueves", "viernes" -> {
                System.out.println("Es día laboral");
            }
            default -> {
                System.out.println("Oops, no has escrito un día de la semana");
            }
        }
    }
}
