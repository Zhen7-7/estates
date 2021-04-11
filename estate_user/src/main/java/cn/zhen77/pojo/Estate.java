package cn.zhen77.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Estate {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer estateid;

    private String estatename;

    private String estateimg;

    private String estateaddress;

    private Integer estateallnum;

    private Integer estatelastnum;

    private String company;

    private Integer buildingnum;

    private Double price;

    private String city;

    public Integer getEstateid() {
        return estateid;
    }

    public void setEstateid(Integer estateid) {
        this.estateid = estateid;
    }

    public String getEstatename() {
        return estatename;
    }

    public void setEstatename(String estatename) {
        this.estatename = estatename;
    }

    public String getEstateimg() {
        return estateimg;
    }

    public void setEstateimg(String estateimg) {
        this.estateimg = estateimg;
    }

    public String getEstateaddress() {
        return estateaddress;
    }

    public void setEstateaddress(String estateaddress) {
        this.estateaddress = estateaddress;
    }

    public Integer getEstateallnum() {
        return estateallnum;
    }

    public void setEstateallnum(Integer estateallnum) {
        this.estateallnum = estateallnum;
    }

    public Integer getEstatelastnum() {
        return estatelastnum;
    }

    public void setEstatelastnum(Integer estatelastnum) {
        this.estatelastnum = estatelastnum;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getBuildingnum() {
        return buildingnum;
    }

    public void setBuildingnum(Integer buildingnum) {
        this.buildingnum = buildingnum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Estate(String estatename, String estateimg, String estateaddress, Integer estateallnum, Integer estatelastnum, String company, Integer buildingnum, Double price, String city) {
        this.estatename = estatename;
        this.estateimg = estateimg;
        this.estateaddress = estateaddress;
        this.estateallnum = estateallnum;
        this.estatelastnum = estatelastnum;
        this.company = company;
        this.buildingnum = buildingnum;
        this.price = price;
        this.city = city;
    }

    public Estate(Integer estateid, String estatename, String estateimg, String estateaddress, Integer estateallnum, Integer estatelastnum, String company, Integer buildingnum, Double price, String city) {
        this.estateid = estateid;
        this.estatename = estatename;
        this.estateimg = estateimg;
        this.estateaddress = estateaddress;
        this.estateallnum = estateallnum;
        this.estatelastnum = estatelastnum;
        this.company = company;
        this.buildingnum = buildingnum;
        this.price = price;
        this.city = city;
    }

    public Estate() {
    }
}