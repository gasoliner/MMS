package cn.mms.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Reportloss {
    private Integer rlid;

    private Integer mid;

    private String material;

    private String rpobject;

    private Float count;

    @JSONField(format = "yyyy-MM-dd")
    private Date rptime;

    public Integer getRlid() {
        return rlid;
    }

    public void setRlid(Integer rlid) {
        this.rlid = rlid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getRpobject() {
        return rpobject;
    }

    public void setRpobject(String rpobject) {
        this.rpobject = rpobject == null ? null : rpobject.trim();
    }

    public Float getCount() {
        return count;
    }

    public void setCount(Float count) {
        this.count = count;
    }

    public Date getRptime() {
        return rptime;
    }

    public void setRptime(Date rptime) {
        this.rptime = rptime;
    }
}