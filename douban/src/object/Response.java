package object;

import java.util.Date;

public class Response {
    private Integer responseid;

    private Integer userid;

    private Integer discussid;

    private Date responsetime;

    private String responsecontent;

    public Integer getResponseid() {
        return responseid;
    }

    public void setResponseid(Integer responseid) {
        this.responseid = responseid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDiscussid() {
        return discussid;
    }

    public void setDiscussid(Integer discussid) {
        this.discussid = discussid;
    }

    public Date getResponsetime() {
        return responsetime;
    }

    public void setResponsetime(Date responsetime) {
        this.responsetime = responsetime;
    }

    public String getResponsecontent() {
        return responsecontent;
    }

    public void setResponsecontent(String responsecontent) {
        this.responsecontent = responsecontent == null ? null : responsecontent.trim();
    }
}