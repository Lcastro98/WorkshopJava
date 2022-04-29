package Exercise3;

import java.util.Scanner;

/**
 * Clase inicial del ejercicio 3
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main3 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo:");
        Double radius = scan.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("El área del circulo es: " + circle.area());
    }
}
