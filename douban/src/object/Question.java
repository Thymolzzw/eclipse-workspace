package object;

import java.util.Date;

public class Question {
    private Integer questionid;

    private Integer userid;

    private Integer movieid;

    private Date begintime;

    private String questiontitle;

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
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

    public String getQuestiontitle() {
        return questiontitle;
    }

    public void setQuestiontitle(String questiontitle) {
        this.questiontitle = questiontitle == null ? null : questiontitle.trim();
    }
}