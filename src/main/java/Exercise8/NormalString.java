package Exercise8;

import java.text.Normalizer;
import java.util.Locale;

public class NormalString {

    /**
     * Método para normalizar un string (elimina tíldes y lo pasa a minuscula)
     *
     * @param texto
     * @return
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static String cleanString(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        texto = texto.toLowerCase(Locale.ROOT);
        return texto;
    }
}
