package object;

public class OwnKey {
    private Integer movieid;

    private String movieduration;

    private String regionalversion;

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public String getMovieduration() {
        return movieduration;
    }

    public void setMovieduration(String movieduration) {
        this.movieduration = movieduration == null ? null : movieduration.trim();
    }

    public String getRegionalversion() {
        return regionalversion;
    }

    public void setRegionalversion(String regionalversion) {
        this.regionalversion = regionalversion == null ? null : regionalversion.trim();
    }
}