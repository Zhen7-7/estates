package cn.zhen77.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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

public class Suggest implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 建议id
     */
    @TableId(value = "suggestid", type = IdType.AUTO)
    private Integer suggestid;

    /**
     * 建议类型
     */
    private String suggesttype;

    /**
     * 建议内容
     */
    private String suggestcontent;

    /**
     * 反馈者id
     */
    private Integer userid;

    /**
     * 图片（选填）
     */
    private String suggestimg1;

    /**
     * 图片（选填）
     */
    private String suggestimg2;

    /**
     * 图片（选填）
     */
    private String suggestimg3;

    /**
     * 图片（选填）
     */
    private String suggestimg4;

    /**
     * 图片（选填）
     */
    private String suggestimg5;

    /**
     * 图片（选填）
     */
    private String suggestimg6;

    /**
     * 图片（选填）
     */
    private String suggestimg7;

    /**
     * 图片（选填）
     */
    private String suggestimg8;

    /**
     * 图片（选填）
     */
    private String suggestimg9;

    /**
     * 是否采纳
     */
    private Boolean issolve;


    public Integer getSuggestid() {
        return suggestid;
    }

    public void setSuggestid(Integer suggestid) {
        this.suggestid = suggestid;
    }

    public String getSuggesttype() {
        return suggesttype;
    }

    public void setSuggesttype(String suggesttype) {
        this.suggesttype = suggesttype;
    }

    public String getSuggestcontent() {
        return suggestcontent;
    }

    public void setSuggestcontent(String suggestcontent) {
        this.suggestcontent = suggestcontent;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSuggestimg1() {
        return suggestimg1;
    }

    public void setSuggestimg1(String suggestimg1) {
        this.suggestimg1 = suggestimg1;
    }

    public String getSuggestimg2() {
        return suggestimg2;
    }

    public void setSuggestimg2(String suggestimg2) {
        this.suggestimg2 = suggestimg2;
    }

    public String getSuggestimg3() {
        return suggestimg3;
    }

    public void setSuggestimg3(String suggestimg3) {
        this.suggestimg3 = suggestimg3;
    }

    public String getSuggestimg4() {
        return suggestimg4;
    }

    public void setSuggestimg4(String suggestimg4) {
        this.suggestimg4 = suggestimg4;
    }

    public String getSuggestimg5() {
        return suggestimg5;
    }

    public void setSuggestimg5(String suggestimg5) {
        this.suggestimg5 = suggestimg5;
    }

    public String getSuggestimg6() {
        return suggestimg6;
    }

    public void setSuggestimg6(String suggestimg6) {
        this.suggestimg6 = suggestimg6;
    }

    public String getSuggestimg7() {
        return suggestimg7;
    }

    public void setSuggestimg7(String suggestimg7) {
        this.suggestimg7 = suggestimg7;
    }

    public String getSuggestimg8() {
        return suggestimg8;
    }

    public void setSuggestimg8(String suggestimg8) {
        this.suggestimg8 = suggestimg8;
    }

    public String getSuggestimg9() {
        return suggestimg9;
    }

    public void setSuggestimg9(String suggestimg9) {
        this.suggestimg9 = suggestimg9;
    }

    public Boolean getIssolve() {
        return issolve;
    }

    public void setIssolve(Boolean issolve) {
        this.issolve = issolve;
    }

    @Override
    public String toString() {
        return "Suggest{" +
        "suggestid=" + suggestid +
        ", suggesttype=" + suggesttype +
        ", suggestcontent=" + suggestcontent +
        ", userid=" + userid +
        ", suggestimg1=" + suggestimg1 +
        ", suggestimg2=" + suggestimg2 +
        ", suggestimg3=" + suggestimg3 +
        ", suggestimg4=" + suggestimg4 +
        ", suggestimg5=" + suggestimg5 +
        ", suggestimg6=" + suggestimg6 +
        ", suggestimg7=" + suggestimg7 +
        ", suggestimg8=" + suggestimg8 +
        ", suggestimg9=" + suggestimg9 +
        ", issolve=" + issolve +
        "}";
    }
}
