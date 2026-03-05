package TEN20151028;

public class Movie extends Media {
    private String director;
    private int playtime;


    public Movie(String title, Genre genre, String director, int playtime) {
        super(title, genre);
        this.director = director;
        this.playtime = playtime;
    }

    public String getDirector() {
        return director;
    }

    public int getPlaytime() {
        return playtime;
    }

    public String toString() {
        return super.toString() + "Director: " + director + ", Time = " + playtime + " mins";
    }
}