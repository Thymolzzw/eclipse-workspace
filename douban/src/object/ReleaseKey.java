package object;

import java.util.Date;

public class ReleaseKey {
    private Integer movieid;

    private Date releasetime;

    private String regionalversion;

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public String getRegionalversion() {
        return regionalversion;
    }

    public void setRegionalversion(String regionalversion) {
        this.regionalversion = regionalversion == null ? null : regionalversion.trim();
    }
}