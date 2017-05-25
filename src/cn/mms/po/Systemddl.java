package cn.mms.po;

public class Systemddl {
    private Integer sysid;

    private String keyword;

    private String ddlname;

    private String ddlremarks;

    public Integer getSysid() {
        return sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getDdlname() {
        return ddlname;
    }

    public void setDdlname(String ddlname) {
        this.ddlname = ddlname == null ? null : ddlname.trim();
    }

    public String getDdlremarks() {
        return ddlremarks;
    }

    public void setDdlremarks(String ddlremarks) {
        this.ddlremarks = ddlremarks == null ? null : ddlremarks.trim();
    }
}