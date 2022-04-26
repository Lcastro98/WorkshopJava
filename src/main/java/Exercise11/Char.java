package Exercise11;

public class Char {

    public String countChars(String phrase, char vowel) {
        int totalCharacters = 0;
        char temp;
        for (int i = 0; i < phrase.length(); i++) {
            temp = phrase.charAt(i);
            if (temp == vowel)
                totalCharacters++;
        }
        String result = "La vocal " + vowel + " se repite " + totalCharacters + " veces";
        return result;
    }
}
