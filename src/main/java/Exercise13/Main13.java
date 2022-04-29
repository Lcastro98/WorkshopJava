package Exercise13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase inicial del ejercicio 13
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main13 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {

        //Asigna un formato de fecha y hora
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha y hora actual es: " + dateTimeFormatter.format(LocalDateTime.now()));
    }
}
