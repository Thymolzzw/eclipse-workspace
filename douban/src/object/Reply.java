package object;

public class Reply {
    private Integer replyid;

    private Integer userid;

    private Integer questionid;

    private String replycontent;

    public Integer getReplyid() {
        return replyid;
    }

    public void setReplyid(Integer replyid) {
        this.replyid = replyid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent == null ? null : replycontent.trim();
    }
}