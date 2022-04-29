package Exercise6;

import Exercise5.NumberClassification;

/**
 * Clase inicial del ejercicio 6
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main6 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        NumberClassification numberClassification = new NumberClassification();
        numberClassification.oddNumbersFor();
        numberClassification.pairNumbersFor();
    }
}
