package Exercise8;

import java.text.Normalizer;
import java.util.Locale;

public class Norm {
    public static String cleanString(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        texto = texto.toLowerCase(Locale.ROOT);
        return texto;
    }
}
