package Exercise12;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba la primera palabra");
        String word1 = scan.nextLine();
        System.out.println("Escriba la segunda palabra");
        String word2 = scan.nextLine();

        if (word1.equals(word2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras no son iguales");
        }
    }
}
