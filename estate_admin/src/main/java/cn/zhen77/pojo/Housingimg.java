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
public class Housingimg implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 房子图片id
     */
    @TableId(value = "housingimgid", type = IdType.AUTO)
    private Integer housingimgid;

    private String housingimg1;

    private String housingimg2;

    private String housingimg3;

    private String housingimg4;

    private String housingimg5;

    public Housingimg(String housingimg1, String housingimg2, String housingimg3, String housingimg4, String housingimg5) {
        this.housingimg1 = housingimg1;
        this.housingimg2 = housingimg2;
        this.housingimg3 = housingimg3;
        this.housingimg4 = housingimg4;
        this.housingimg5 = housingimg5;
    }

    public Integer getHousingimgid() {
        return housingimgid;
    }

    public void setHousingimgid(Integer housingimgid) {
        this.housingimgid = housingimgid;
    }

    public String getHousingimg1() {
        return housingimg1;
    }

    public void setHousingimg1(String housingimg1) {
        this.housingimg1 = housingimg1;
    }

    public String getHousingimg2() {
        return housingimg2;
    }

    public void setHousingimg2(String housingimg2) {
        this.housingimg2 = housingimg2;
    }

    public String getHousingimg3() {
        return housingimg3;
    }

    public void setHousingimg3(String housingimg3) {
        this.housingimg3 = housingimg3;
    }

    public String getHousingimg4() {
        return housingimg4;
    }

    public void setHousingimg4(String housingimg4) {
        this.housingimg4 = housingimg4;
    }

    public String getHousingimg5() {
        return housingimg5;
    }

    public void setHousingimg5(String housingimg5) {
        this.housingimg5 = housingimg5;
    }

    @Override
    public String toString() {
        return "Housingimg{" +
        "housingimgid=" + housingimgid +
        ", housingimg1=" + housingimg1 +
        ", housingimg2=" + housingimg2 +
        ", housingimg3=" + housingimg3 +
        ", housingimg4=" + housingimg4 +
        ", housingimg5=" + housingimg5 +
        "}";
    }
}
