package Exercise15;

import java.util.Scanner;

/**
 * Clase inicial del ejercicio 15
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main15 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean finish = false;
        String menu = """
                ****** GESTION CINEMATOGRÁFICA ********
                1-NUEVO ACTOR
                2-BUSCAR ACTOR
                3-ELIMINAR ACTOR
                4-MODIFICAR ACTOR
                5-VER TODOS LOS ACTORES
                6- VER PELICULAS DE LOS ACTORES                   
                7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
                8-SALIR""";
        System.out.println(menu);

        //Imprime el menu mientras el número indicado sea diferente a 8
        do {
            System.out.println("Escriba un número: ");
            Integer option = scan.nextInt();
            switch (option) {
                case 1, 2, 3, 4, 5, 6, 7 -> {
                    System.out.println(menu);
                }
                case 8 -> {
                    finish = true;
                }
                default -> {
                    System.out.println("Opción incorrecta");
                    System.out.println(menu);
                }
            }
        } while (finish == false);
    }

}
