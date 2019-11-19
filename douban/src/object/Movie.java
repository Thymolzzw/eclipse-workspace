package object;

public class Movie {
    private Integer movieid;

    private String imdb;

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb == null ? null : imdb.trim();
    }
}