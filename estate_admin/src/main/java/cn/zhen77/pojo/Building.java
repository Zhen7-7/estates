package cn.zhen77.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-24
 */
public class Building implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 楼id(几号楼)
     */
    private Integer buildingid;

    /**
     * 所属小区id
     */
    private Integer estateid;

    /**
     * 楼房图片
     */
    private String buildingimg;

    /**
     * 所含单元个数
     */
    private Integer housingunitnum;

    /**
     * 所含层数
     */
    private Integer buildingfloornum;

    /**
     * 是否有电梯
     */
    private Boolean haselevator;

    public Building(Integer estateid, String buildingimg, Integer housingunitnum, Integer buildingfloornum) {
        this.estateid = estateid;
        this.buildingimg = buildingimg;
        this.housingunitnum = housingunitnum;
        this.buildingfloornum = buildingfloornum;
    }

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
        this.buildingimg = buildingimg;
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

    @Override
    public String toString() {
        return "Building{" +
        "buildingid=" + buildingid +
        ", estateid=" + estateid +
        ", buildingimg=" + buildingimg +
        ", housingunitnum=" + housingunitnum +
        ", buildingfloornum=" + buildingfloornum +
        ", haselevator=" + haselevator +
        "}";
    }
}
