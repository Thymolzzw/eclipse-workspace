package object;

public class ConferKey {
    private Integer movieid;

    private String conferencename;

    private String winner;

    private String awardsname;

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public String getConferencename() {
        return conferencename;
    }

    public void setConferencename(String conferencename) {
        this.conferencename = conferencename == null ? null : conferencename.trim();
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner == null ? null : winner.trim();
    }

    public String getAwardsname() {
        return awardsname;
    }

    public void setAwardsname(String awardsname) {
        this.awardsname = awardsname == null ? null : awardsname.trim();
    }
}