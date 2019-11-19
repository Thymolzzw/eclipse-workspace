package object;

public class MakeKey {
    private Integer movieid;

    private Integer personnelid;

    private String personneltype;

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }

    public String getPersonneltype() {
        return personneltype;
    }

    public void setPersonneltype(String personneltype) {
        this.personneltype = personneltype == null ? null : personneltype.trim();
    }
}