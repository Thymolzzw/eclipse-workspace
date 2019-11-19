package object;

import java.util.Date;

public class Comment {
    private Integer commentid;

    private Integer userid;

    private Integer movieid;

    private Integer starlevel;

    private String device;

    private Date commenttime;

    private String viewstatus;

    private Integer usefulnumber;

    private String commentcontent;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
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

    public Integer getStarlevel() {
        return starlevel;
    }

    public void setStarlevel(Integer starlevel) {
        this.starlevel = starlevel;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public String getViewstatus() {
        return viewstatus;
    }

    public void setViewstatus(String viewstatus) {
        this.viewstatus = viewstatus == null ? null : viewstatus.trim();
    }

    public Integer getUsefulnumber() {
        return usefulnumber;
    }

    public void setUsefulnumber(Integer usefulnumber) {
        this.usefulnumber = usefulnumber;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }
}