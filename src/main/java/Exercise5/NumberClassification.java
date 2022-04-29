package Exercise5;

public class NumberClassification {

    /**
     * Método para imprimir los números pares hasta el 100 con while
     *
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public void pairNumbersWhile() {
        Integer number = 0;
        System.out.println("Numeros pares: ");
        while (number <= 100) {
            System.out.println(number);
            number = number + 2;
        }
    }

    /**
     * Método para imprimir los números impares hasta el 100 con while
     *
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public void oddNumbersWhile() {
        Integer number = 1;
        System.out.println("Numeros impares: ");
        while (number <= 100) {
            System.out.println(number);
            number = number + 2;
        }
    }

    /**
     * Método para imprimir los números pares hasta el 100 con for
     *
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public void pairNumbersFor() {
        System.out.println("Numeros pares: ");
        for (Integer number = 0; number <= 100; number = number + 2) {
            System.out.println(number);
        }
    }

    /**
     * Método para imprimir los números impares hasta el 100 con for
     *
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public void oddNumbersFor() {
        System.out.println("Numeros impares: ");
        for (Integer number = 1; number <= 100; number = number + 2) {
            System.out.println(number);
        }
    }
}
