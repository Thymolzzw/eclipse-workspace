package object;

import java.util.Date;

public class Personnel {
    private Integer personnelid;

    private Date birthday;

    private String sex;

    private String constellation;

    private String nationality;

    private String personnelname;

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null ? null : constellation.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getPersonnelname() {
        return personnelname;
    }

    public void setPersonnelname(String personnelname) {
        this.personnelname = personnelname == null ? null : personnelname.trim();
    }
}