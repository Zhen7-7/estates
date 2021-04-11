package cn.zhen77.pojo;

public class Building {
    private Integer buildingid;

    private Integer estateid;

    private Integer housingunitnum;

    private Integer buildingfloornum;

    private Boolean haselevator;

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public Integer getEstateid() {
        return estateid;
    }

    public void setEstateid(Integer estateid) {
        this.estateid = estateid;
    }

    public Integer getHousingunitnum() {
        return housingunitnum;
    }

    public void setHousingunitnum(Integer housingunitnum) {
        this.housingunitnum = housingunitnum;
    }

    public Integer getBuildingfloornum() {
        return buildingfloornum;
    }

    public void setBuildingfloornum(Integer buildingfloornum) {
        this.buildingfloornum = buildingfloornum;
    }

    public Boolean getHaselevator() {
        return haselevator;
    }

    public void setHaselevator(Boolean haselevator) {
        this.haselevator = haselevator;
    }

    public Building() {
    }

    public Building(Integer estateid, Integer housingunitnum, Integer buildingfloornum, Boolean haselevator) {
        this.estateid = estateid;
        this.housingunitnum = housingunitnum;
        this.buildingfloornum = buildingfloornum;
        this.haselevator = haselevator;
    }

    public Building(Integer buildingid, Integer estateid, Integer housingunitnum, Integer buildingfloornum, Boolean haselevator) {
        this.buildingid = buildingid;
        this.estateid = estateid;
        this.housingunitnum = housingunitnum;
        this.buildingfloornum = buildingfloornum;
        this.haselevator = haselevator;
    }
}