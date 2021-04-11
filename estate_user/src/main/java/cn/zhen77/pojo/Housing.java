package cn.zhen77.pojo;

public class Housing {
    private Integer housingid;

    private Integer buildingid;

    private String housingimga;

    private String housingimgb;

    private String housingimgc;

    private String housingimgd;

    private String housingimge;

    private String housingtype;

    private Integer housingarea;

    private Integer housingrealarea;

    private Double housingprice;

    private Integer housingunit;

    private Integer housingroom;

    private Boolean housingfinish;

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

    public String getHousingimga() {
        return housingimga;
    }

    public void setHousingimga(String housingimga) {
        this.housingimga = housingimga == null ? null : housingimga.trim();
    }

    public String getHousingimgb() {
        return housingimgb;
    }

    public void setHousingimgb(String housingimgb) {
        this.housingimgb = housingimgb == null ? null : housingimgb.trim();
    }

    public String getHousingimgc() {
        return housingimgc;
    }

    public void setHousingimgc(String housingimgc) {
        this.housingimgc = housingimgc == null ? null : housingimgc.trim();
    }

    public String getHousingimgd() {
        return housingimgd;
    }

    public void setHousingimgd(String housingimgd) {
        this.housingimgd = housingimgd == null ? null : housingimgd.trim();
    }

    public String getHousingimge() {
        return housingimge;
    }

    public void setHousingimge(String housingimge) {
        this.housingimge = housingimge == null ? null : housingimge.trim();
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

    public Housing() {
    }

    public Housing(Integer housingid, Integer buildingid, String housingimga, String housingimgb, String housingimgc, String housingimgd, String housingimge, String housingtype, Integer housingarea, Integer housingrealarea, Double housingprice, Integer housingunit, Integer housingroom, Boolean housingfinish) {
        this.housingid = housingid;
        this.buildingid = buildingid;
        this.housingimga = housingimga;
        this.housingimgb = housingimgb;
        this.housingimgc = housingimgc;
        this.housingimgd = housingimgd;
        this.housingimge = housingimge;
        this.housingtype = housingtype;
        this.housingarea = housingarea;
        this.housingrealarea = housingrealarea;
        this.housingprice = housingprice;
        this.housingunit = housingunit;
        this.housingroom = housingroom;
        this.housingfinish = housingfinish;
    }
}