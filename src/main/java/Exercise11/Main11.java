package Exercise11;

import Exercise8.Norm;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Char letter = new Char();
        Norm norm = new Norm();

        System.out.println("Ingrese una frase:");
        String phrase = scan.nextLine();
        phrase = norm.cleanString(phrase);

        Integer length = phrase.length();
        System.out.println("La longitud de la frase es: " + length);

        System.out.println(letter.countChars(phrase, (char) 97));
        System.out.println(letter.countChars(phrase, (char) 101));
        System.out.println(letter.countChars(phrase, (char) 105));
        System.out.println(letter.countChars(phrase, (char) 111));
        System.out.println(letter.countChars(phrase, (char) 117));
    }
}
