package Exercise11;

public class Char {

    /**
     * Cuenta la cantidad de veces que se repite un caracter
     * En este caso la vocal que se le indique al llamar la función
     *
     * @param phrase
     * @param vowel
     * @return
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @version 1.0.0
     */
    public String countChars(String phrase, char vowel) {
        int totalVowel = 0;
        char character;
        for (int index = 0; index < phrase.length(); index++) {
            character = phrase.charAt(index);
            if (character == vowel)
                totalVowel++;
        }
        String result = "La vocal " + vowel + " se repite " + totalVowel + " veces";
        return result;
    }
}
