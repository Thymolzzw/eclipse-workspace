package object;

public class LabelKey {
    private Integer commentid;

    private String assesstag;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getAssesstag() {
        return assesstag;
    }

    public void setAssesstag(String assesstag) {
        this.assesstag = assesstag == null ? null : assesstag.trim();
    }
}