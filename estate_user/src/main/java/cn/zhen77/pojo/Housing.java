package cn.zhen77.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Housing {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer housingid;

    private Integer buildingid;

//    private Integer housingimgid;

    private String housingtype;

    private Integer housingarea;

    private Integer housingrealarea;

    private Double housingprice;

    private Integer housingunit;

    private Integer housingroom;

    private Boolean housingfinish;

    private Housingimg housingimg;

    public Housing() {
    }

    @Override
    public String toString() {
        return "Housing{" +
                "housingid=" + housingid +
                ", buildingid=" + buildingid +
                ", housingtype='" + housingtype + '\'' +
                ", housingarea=" + housingarea +
                ", housingrealarea=" + housingrealarea +
                ", housingprice=" + housingprice +
                ", housingunit=" + housingunit +
                ", housingroom=" + housingroom +
                ", housingfinish=" + housingfinish +
                ", housingimg=" + housingimg +
                '}';
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

    public String getHousingtype() {
        return housingtype;
    }

    public void setHousingtype(String housingtype) {
        this.housingtype = housingtype;
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

    public Housingimg getHousingimg() {
        return housingimg;
    }

    public void setHousingimg(Housingimg housingimg) {
        this.housingimg = housingimg;
    }

    public Housing(Integer housingid, Integer buildingid, String housingtype, Integer housingarea, Integer housingrealarea, Double housingprice, Integer housingunit, Integer housingroom, Boolean housingfinish, Housingimg housingimg) {
        this.housingid = housingid;
        this.buildingid = buildingid;
        this.housingtype = housingtype;
        this.housingarea = housingarea;
        this.housingrealarea = housingrealarea;
        this.housingprice = housingprice;
        this.housingunit = housingunit;
        this.housingroom = housingroom;
        this.housingfinish = housingfinish;
        this.housingimg = housingimg;
    }
}