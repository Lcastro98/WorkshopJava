package Exercise4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        Float priceProduct = scan.nextFloat();

        IVA iva = new IVA(priceProduct);
        Float priceTotal = priceProduct + iva.calculate();
        System.out.println("El precio final del producto con IVA es: " + priceTotal);
    }
}
