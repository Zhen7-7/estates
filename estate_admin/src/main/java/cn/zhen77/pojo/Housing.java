package cn.zhen77.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Housing implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 房屋id
     */
    @TableId(value = "housingid", type = IdType.AUTO)
    private Integer housingid;

    /**
     * 楼号
     */
    private Integer buildingid;

    /**
     * 房屋图片id
     */
    private Integer housingimgid;

    /**
     * 房屋类型(几室几厅)
     */
    private String housingtype;

    /**
     * 房屋面积
     */
    private Integer housingarea;

    /**
     * 可用面积
     */
    private Integer housingrealarea;

    /**
     * 房屋价格/m²
     */
    private Double housingprice;

    /**
     * 单元号
     */
    private Integer housingunit;

    /**
     * 门牌号
     */
    private Integer housingroom;

    /**
     * 是否装修
     */
    private Boolean housingfinish= true;

    public Housing(Integer buildingid, Integer housingimgid, String housingtype, Integer housingarea, Integer housingrealarea, Double housingprice, Integer housingunit, Integer housingroom) {
        this.buildingid = buildingid;
        this.housingimgid = housingimgid;
        this.housingtype = housingtype;
        this.housingarea = housingarea;
        this.housingrealarea = housingrealarea;
        this.housingprice = housingprice;
        this.housingunit = housingunit;
        this.housingroom = housingroom;
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

    @Override
    public String toString() {
        return "Housing{" +
        "housingid=" + housingid +
        ", buildingid=" + buildingid +
        ", housingimgid=" + housingimgid +
        ", housingtype=" + housingtype +
        ", housingarea=" + housingarea +
        ", housingrealarea=" + housingrealarea +
        ", housingprice=" + housingprice +
        ", housingunit=" + housingunit +
        ", housingroom=" + housingroom +
        ", housingfinish=" + housingfinish +
        "}";
    }
}
