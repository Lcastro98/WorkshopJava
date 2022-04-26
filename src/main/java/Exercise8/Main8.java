package Exercise8;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Norm norm = new Norm();

        System.out.println("Escribe un día de la semana");
        String day = scan.nextLine();
        day = norm.cleanString(day);

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
