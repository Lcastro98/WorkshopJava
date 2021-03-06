package Exercise18;

/**
 * Clase inicial del ejercicio 18
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main18 {

    /**
     * Método principal con el que inicia el sistema
     *
     * @param args
     * @author Lorena Castro <Lcastro0398@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Serie series[] = new Serie[5];
        VideoGame videogames[] = new VideoGame[5];

        series[0] = new Serie("Friends", "Marta Kauffman y David Crane");
        series[1] = new Serie("FullMetal Alchemist", "Hiromu Arakawa");
        series[2] = new Serie("Hunter x Hunter", "Yoshihiro Togashi");
        series[3] = new Serie("Dragon Ball", "Akira Toriyama");
        series[4] = new Serie("Death Note", "Tsugumi Ōba y Cristian");

        videogames[0] = new VideoGame();
        videogames[1] = new VideoGame();
        videogames[2] = new VideoGame();
        videogames[3] = new VideoGame();
        videogames[4] = new VideoGame();

        series[0].deliver();
        videogames[0].deliver();
    }

}
