package Exercise15;

import java.util.Scanner;

public class Main15 {
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
