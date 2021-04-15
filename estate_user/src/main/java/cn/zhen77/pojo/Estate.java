package cn.zhen77.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-15
 */
public class Estate implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 小区id
     */
    @TableId(value = "estateid", type = IdType.AUTO)
    private Integer estateid;

    /**
     * 小区名称
     */
    private String estatename;

    /**
     * 图片
     */
    private String estateimg;

    /**
     * 小区地址
     */
    private String estateaddress;

    /**
     * 小区总户数
     */
    private Integer estateallnum;

    /**
     * 小区剩余户数
     */
    private Integer estatelastnum;

    /**
     * 所属公司
     */
    @TableField("Company")
    private String Company;

    /**
     * 楼房数量
     */
    @TableField("Buildingnum")
    private Integer Buildingnum;

    /**
     * 万元\m²
     */
    @TableField("Price")
    private Double Price;

    /**
     * 城市
     */
    private String city;

    public Estate() {
    }

    public Estate(Integer estateid, String estatename, String estateimg, String estateaddress, Integer estateallnum, Integer estatelastnum, String company, Integer buildingnum, Double price, String city) {
        this.estateid = estateid;
        this.estatename = estatename;
        this.estateimg = estateimg;
        this.estateaddress = estateaddress;
        this.estateallnum = estateallnum;
        this.estatelastnum = estatelastnum;
        Company = company;
        Buildingnum = buildingnum;
        Price = price;
        this.city = city;
    }

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
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public Integer getBuildingnum() {
        return Buildingnum;
    }

    public void setBuildingnum(Integer Buildingnum) {
        this.Buildingnum = Buildingnum;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Estate{" +
        "estateid=" + estateid +
        ", estatename=" + estatename +
        ", estateimg=" + estateimg +
        ", estateaddress=" + estateaddress +
        ", estateallnum=" + estateallnum +
        ", estatelastnum=" + estatelastnum +
        ", Company=" + Company +
        ", Buildingnum=" + Buildingnum +
        ", Price=" + Price +
        ", city=" + city +
        "}";
    }
}
