package Exercise2;

import Exercise1.NumberComparison;

import java.util.Scanner;

/**
 * Clase inicial del ejercicio 2
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main2 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite el primer número");
        Integer number1 = scan.nextInt();
        System.out.println("Digite el segundo número");
        Integer number2 = scan.nextInt();

        NumberComparison numberComparison = new NumberComparison();
        numberComparison.isGreater(number1, number2);
    }
}
