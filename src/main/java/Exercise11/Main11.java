package Exercise11;

import Exercise8.NormalString;

import java.util.Scanner;

/**
 * Clase inicial del ejercicio 11
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main11 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Char letter = new Char();
        NormalString normal = new NormalString();

        System.out.println("Ingrese una frase:");
        String phrase = scan.nextLine();
        phrase = normal.cleanString(phrase);

        Integer length = phrase.length();
        System.out.println("La longitud de la frase es: " + length);

        System.out.println(letter.countChars(phrase, 'a'));
        System.out.println(letter.countChars(phrase, 'e'));
        System.out.println(letter.countChars(phrase, 'i'));
        System.out.println(letter.countChars(phrase, 'o'));
        System.out.println(letter.countChars(phrase, 'u'));
    }
}
