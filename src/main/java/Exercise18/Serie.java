package Exercise18;

/**
 * Contiene los atributos y métodos de la clase serie
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Serie implements IDeliverable {
    private String title = "";
    private Integer seasons = 3;
    private Boolean delivered = false;
    private String genre = "";
    private String author = "";

    /**
     * Constructor por defecto
     */
    public Serie() {
    }

    /**
     * Constructor con los atributos titulo y autor
     *
     * @param title
     * @param author
     */
    public Serie(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Constructor con todos los atributos
     *
     * @param title
     * @param seasons
     * @param genre
     * @param author
     */
    public Serie(String title, Integer seasons, String genre, String author) {
        this.title = title;
        this.seasons = seasons;
        this.genre = genre;
        this.author = author;
    }

    /**
     * Método accesor de titulo
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Método modificador de titulo
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Método acesor de temporadas
     *
     * @return
     */
    public Integer getSeasons() {
        return seasons;
    }

    /**
     * Método modificador de temporadas
     *
     * @param seasons
     */
    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    /**
     * Método accesor de género
     *
     * @return
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Método modificador de género
     *
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Método accesor de autor
     *
     * @return
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Método modificador de autor
     *
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Se sobreescribe el método toString para mostrar los datos
     *
     * @return
     */
    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", seasons=" + seasons +
                ", delivered=" + delivered +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    /**
     * Se implementa el método entregar
     */
    @Override
    public void deliver() {
        this.delivered = true;
    }

    /**
     * Se implementa el método devolver
     */
    @Override
    public void giveBack() {
        this.delivered = false;
    }

    /**
     * Se implementa el método isEntregado
     *
     * @return
     */
    @Override
    public Boolean isDelivered() {
        return this.delivered;
    }
}
