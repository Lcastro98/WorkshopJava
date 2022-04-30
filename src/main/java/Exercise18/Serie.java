package Exercise18;

public class Serie implements IDeliverable {
    private String title = "";
    private Integer seasons = 3;
    private Boolean delivered = false;
    private String genre = "";
    private String author = "";

    public Serie() {
    }

    public Serie(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Serie(String title, Integer seasons, String genre, String author) {
        this.title = title;
        this.seasons = seasons;
        this.genre = genre;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

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

    @Override
    public void deliver() {
        this.delivered = true;
    }

    @Override
    public void giveBack() {
        this.delivered = false;
    }

    @Override
    public Boolean isDelivered() {
        return this.delivered;
    }
}
