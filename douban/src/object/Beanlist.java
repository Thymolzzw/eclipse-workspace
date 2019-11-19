package object;

public class Beanlist {
    private Integer beanlistid;

    private String beanlistname;

    private Integer userid;

    public Integer getBeanlistid() {
        return beanlistid;
    }

    public void setBeanlistid(Integer beanlistid) {
        this.beanlistid = beanlistid;
    }

    public String getBeanlistname() {
        return beanlistname;
    }

    public void setBeanlistname(String beanlistname) {
        this.beanlistname = beanlistname == null ? null : beanlistname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}