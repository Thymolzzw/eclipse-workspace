package object;

import java.util.Date;

public class Discuss {
    private Integer discussid;

    private Integer userid;

    private Integer movieid;

    private Date begintime;

    private String discusstitle;

    public Integer getDiscussid() {
        return discussid;
    }

    public void setDiscussid(Integer discussid) {
        this.discussid = discussid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public String getDiscusstitle() {
        return discusstitle;
    }

    public void setDiscusstitle(String discusstitle) {
        this.discusstitle = discusstitle == null ? null : discusstitle.trim();
    }
}