package cn.mms.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Instore {
    private Integer isid;

    private Integer mid;

    private String material;

    private Float count;

    private Float price;

    private String provider;

    private Integer isreturn;

    private Integer borrowid;

    @JSONField(format = "yyyy-MM-dd")
    private Date returndate;

    public Integer getIsid() {
        return isid;
    }

    public void setIsid(Integer isid) {
        this.isid = isid;
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    public Integer getIsreturn() {
        return isreturn;
    }

    public void setIsreturn(Integer isreturn) {
        this.isreturn = isreturn;
    }

    public Integer getBorrowid() {
        return borrowid;
    }

    public void setBorrowid(Integer borrowid) {
        this.borrowid = borrowid;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }
}