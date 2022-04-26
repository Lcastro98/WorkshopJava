package Exercise9;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = "La sonrisa sera la mejor arma contra la tristeza";
        text = text.replace("a", "e");

        System.out.println("Escriba una frase");
        String consolaText = scan.nextLine();

        System.out.println(text + " " + consolaText);
    }
}
