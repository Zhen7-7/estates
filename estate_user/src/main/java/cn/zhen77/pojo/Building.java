package cn.zhen77.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Building {

    private Integer buildingid;

    private Integer estateid;

    private String buildingimg;

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

    public String getBuildingimg() {
        return buildingimg;
    }

    public void setBuildingimg(String buildingimg) {
        this.buildingimg = buildingimg == null ? null : buildingimg.trim();
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
}