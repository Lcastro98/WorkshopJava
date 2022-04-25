package Exercise3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo:");
        Double radius = scan.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("El área del circulo es: " + circle.area());
    }
}
