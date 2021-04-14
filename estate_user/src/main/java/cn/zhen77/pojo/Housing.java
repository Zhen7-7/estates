package cn.zhen77.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Housing {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer housingid;

    private Integer buildingid;

    private Integer housingimgid;

    private String housingtype;

    private Integer housingarea;

    private Integer housingrealarea;

    private Double housingprice;

    private Integer housingunit;

    private Integer housingroom;

    private Boolean housingfinish;

    private Housingimg housingimg;

    public Housing(Integer housingid, Integer buildingid, Integer housingimgid, String housingtype, Integer housingarea, Integer housingrealarea, Double housingprice, Integer housingunit, Integer housingroom, Boolean housingfinish, Housingimg housingimg) {
        this.housingid = housingid;
        this.buildingid = buildingid;
        this.housingimgid = housingimgid;
        this.housingtype = housingtype;
        this.housingarea = housingarea;
        this.housingrealarea = housingrealarea;
        this.housingprice = housingprice;
        this.housingunit = housingunit;
        this.housingroom = housingroom;
        this.housingfinish = housingfinish;
        this.housingimg = housingimg;
    }

    public Integer getHousingid() {
        return housingid;
    }

    public void setHousingid(Integer housingid) {
        this.housingid = housingid;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public Integer getHousingimgid() {
        return housingimgid;
    }

    public void setHousingimgid(Integer housingimgid) {
        this.housingimgid = housingimgid;
    }

    public String getHousingtype() {
        return housingtype;
    }

    public void setHousingtype(String housingtype) {
        this.housingtype = housingtype == null ? null : housingtype.trim();
    }

    public Integer getHousingarea() {
        return housingarea;
    }

    public void setHousingarea(Integer housingarea) {
        this.housingarea = housingarea;
    }

    public Integer getHousingrealarea() {
        return housingrealarea;
    }

    public void setHousingrealarea(Integer housingrealarea) {
        this.housingrealarea = housingrealarea;
    }

    public Double getHousingprice() {
        return housingprice;
    }

    public void setHousingprice(Double housingprice) {
        this.housingprice = housingprice;
    }

    public Integer getHousingunit() {
        return housingunit;
    }

    public void setHousingunit(Integer housingunit) {
        this.housingunit = housingunit;
    }

    public Integer getHousingroom() {
        return housingroom;
    }

    public void setHousingroom(Integer housingroom) {
        this.housingroom = housingroom;
    }

    public Boolean getHousingfinish() {
        return housingfinish;
    }

    public void setHousingfinish(Boolean housingfinish) {
        this.housingfinish = housingfinish;
    }

    public Housing(Integer housingid, Integer buildingid, Integer housingimgid, String housingtype, Integer housingarea, Integer housingrealarea, Double housingprice, Integer housingunit, Integer housingroom, Boolean housingfinish) {
        this.housingid = housingid;
        this.buildingid = buildingid;
        this.housingimgid = housingimgid;
        this.housingtype = housingtype;
        this.housingarea = housingarea;
        this.housingrealarea = housingrealarea;
        this.housingprice = housingprice;
        this.housingunit = housingunit;
        this.housingroom = housingroom;
        this.housingfinish = housingfinish;
    }

    public Housing() {
    }
}