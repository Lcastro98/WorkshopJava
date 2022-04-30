package Exercise18;

public class VideoGame implements IDeliverable {
    private String title = "";
    private Integer hours = 10;
    private Boolean delivered = false;
    private String genre = "";
    private String company = "";

    public VideoGame() {
    }

    public VideoGame(String title, Integer hours) {
        this.title = title;
        this.hours = hours;
    }

    public VideoGame(String title, Integer hours, String genre, String company) {
        this.title = title;
        this.hours = hours;
        this.genre = genre;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

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
