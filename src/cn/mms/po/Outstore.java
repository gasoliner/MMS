package cn.mms.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Outstore {
    private Integer osid;

    private Integer mid;

    private String material;

    private Float count;

    private String outway;

    private String liable;

    private String useobject;

    @JSONField(format = "yyyy-MM-dd")
    private Date outtime;

    private Integer isreturn;

    @JSONField(format = "yyyy-MM-dd")
    private Date returntime;

    @Override
    public String toString() {
        return "Outstore{" +
                "osid=" + osid +
                ", mid=" + mid +
                ", material='" + material + '\'' +
                ", count=" + count +
                ", outway='" + outway + '\'' +
                ", liable='" + liable + '\'' +
                ", useobject='" + useobject + '\'' +
                ", outtime=" + outtime +
                ", isreturn=" + isreturn +
                ", returntime=" + returntime +
                '}';
    }

    public Integer getOsid() {
        return osid;
    }

    public void setOsid(Integer osid) {
        this.osid = osid;
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

    public Float getCount() {
        return count;
    }

    public void setCount(Float count) {
        this.count = count;
    }

    public String getOutway() {
        return outway;
    }

    public void setOutway(String outway) {
        this.outway = outway == null ? null : outway.trim();
    }

    public String getLiable() {
        return liable;
    }

    public void setLiable(String liable) {
        this.liable = liable == null ? null : liable.trim();
    }

    public String getUseobject() {
        return useobject;
    }

    public void setUseobject(String useobject) {
        this.useobject = useobject == null ? null : useobject.trim();
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public Integer getIsreturn() {
        return isreturn;
    }

    public void setIsreturn(Integer isreturn) {
        this.isreturn = isreturn;
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }
}