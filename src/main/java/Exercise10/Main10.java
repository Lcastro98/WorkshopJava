package Exercise10;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String phrase = scan.nextLine();
        phrase = phrase.replace(" ", "");
        System.out.println(phrase);
    }
}
