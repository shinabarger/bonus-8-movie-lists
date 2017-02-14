/**
 * Created by davidshinabarger on 2/14/17.
 */
public class Movie {
    private String name;
    private String genre;

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;

    }
    @Override
    public String toString() {
        return name + "\t" + genre;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }


}
