package Exercise18;

/**
 * Contiene los atributos y métodos de la clase videojuego
 *
 * @author Lorena Castro <Lcastro0398@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class VideoGame implements IDeliverable {
    private String title = "";
    private Integer hours = 10;
    private Boolean delivered = false;
    private String genre = "";
    private String company = "";

    /**
     * Constructor por defecto
     */
    public VideoGame() {
    }

    /**
     * Constructor con los atributos titulo y horas
     *
     * @param title
     * @param hours
     */
    public VideoGame(String title, Integer hours) {
        this.title = title;
        this.hours = hours;
    }

    /**
     * Constructor con todos los atributos
     *
     * @param title
     * @param hours
     * @param genre
     * @param company
     */
    public VideoGame(String title, Integer hours, String genre, String company) {
        this.title = title;
        this.hours = hours;
        this.genre = genre;
        this.company = company;
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
     * Método accesor de hora
     *
     * @return
     */
    public Integer getHours() {
        return hours;
    }

    /**
     * Método modificador de hora
     *
     * @param hours
     */
    public void setHours(Integer hours) {
        this.hours = hours;
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
     * Método accesor de compañia
     *
     * @return
     */
    public String getCompany() {
        return company;
    }

    /**
     * Método modificador de compañía
     *
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Se sobreescribe el método toString para mostrar los datos
     *
     * @return
     */
    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", hours=" + hours +
                ", delivered=" + delivered +
                ", genre='" + genre + '\'' +
                ", company='" + company + '\'' +
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
