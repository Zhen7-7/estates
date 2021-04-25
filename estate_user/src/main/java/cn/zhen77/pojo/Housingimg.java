package cn.zhen77.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Housingimg {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer housingimgid;

    private String housingimg1;

    private String housingimg2;

    private String housingimg3;

    private String housingimg4;

    private String housingimg5;

    public Housingimg(Integer housingimgid, String housingimg1, String housingimg2, String housingimg3, String housingimg4, String housingimg5) {
        this.housingimgid = housingimgid;
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
        this.housingimg1 = housingimg1 == null ? null : housingimg1.trim();
    }

    public String getHousingimg2() {
        return housingimg2;
    }

    public void setHousingimg2(String housingimg2) {
        this.housingimg2 = housingimg2 == null ? null : housingimg2.trim();
    }

    public String getHousingimg3() {
        return housingimg3;
    }

    public void setHousingimg3(String housingimg3) {
        this.housingimg3 = housingimg3 == null ? null : housingimg3.trim();
    }

    public String getHousingimg4() {
        return housingimg4;
    }

    public void setHousingimg4(String housingimg4) {
        this.housingimg4 = housingimg4 == null ? null : housingimg4.trim();
    }

    public String getHousingimg5() {
        return housingimg5;
    }

    public void setHousingimg5(String housingimg5) {
        this.housingimg5 = housingimg5 == null ? null : housingimg5.trim();
    }

    @Override
    public String toString() {
        return "Housingimg{" +
                "housingimgid=" + housingimgid +
                ", housingimg1='" + housingimg1 + '\'' +
                ", housingimg2='" + housingimg2 + '\'' +
                ", housingimg3='" + housingimg3 + '\'' +
                ", housingimg4='" + housingimg4 + '\'' +
                ", housingimg5='" + housingimg5 + '\'' +
                '}';
    }
}