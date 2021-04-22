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
 * @since 2021-04-22
 */
@Data
@NoArgsConstructor
public class Report implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 举报编号
     */
    @TableId(value = "reportid", type = IdType.AUTO)
    private Integer reportid;

    /**
     * 举报用户id
     */
    private Integer userid;

    /**
     * 举报类型
     */
    private String reporttype;

    /**
     * 举报内容
     */
    private String reportcontent;

    /**
     * 图片1（选填）
     */
    private String reportimg1;

    /**
     * 图片2（选填）
     */
    private String reportimg2;

    /**
     * 图片3（选填）
     */
    private String reportimg3;

    /**
     * 图片4（选填）
     */
    private String reportimg4;

    /**
     * 图片5（选填）
     */
    private String reportimg5;

    /**
     * 图片6（选填）
     */
    private String reportimg6;

    /**
     * 图片7（选填）
     */
    private String reportimg7;

    /**
     * 图片8（选填）
     */
    private String reportimg8;

    /**
     * 图片9（选填）
     */
    private String reportimg9;

    /**
     * 是否被解决
     */
    private Boolean issolve;


    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype;
    }

    public String getReportcontent() {
        return reportcontent;
    }

    public void setReportcontent(String reportcontent) {
        this.reportcontent = reportcontent;
    }

    public String getReportimg1() {
        return reportimg1;
    }

    public void setReportimg1(String reportimg1) {
        this.reportimg1 = reportimg1;
    }

    public String getReportimg2() {
        return reportimg2;
    }

    public void setReportimg2(String reportimg2) {
        this.reportimg2 = reportimg2;
    }

    public String getReportimg3() {
        return reportimg3;
    }

    public void setReportimg3(String reportimg3) {
        this.reportimg3 = reportimg3;
    }

    public String getReportimg4() {
        return reportimg4;
    }

    public void setReportimg4(String reportimg4) {
        this.reportimg4 = reportimg4;
    }

    public String getReportimg5() {
        return reportimg5;
    }

    public void setReportimg5(String reportimg5) {
        this.reportimg5 = reportimg5;
    }

    public String getReportimg6() {
        return reportimg6;
    }

    public void setReportimg6(String reportimg6) {
        this.reportimg6 = reportimg6;
    }

    public String getReportimg7() {
        return reportimg7;
    }

    public void setReportimg7(String reportimg7) {
        this.reportimg7 = reportimg7;
    }

    public String getReportimg8() {
        return reportimg8;
    }

    public void setReportimg8(String reportimg8) {
        this.reportimg8 = reportimg8;
    }

    public String getReportimg9() {
        return reportimg9;
    }

    public void setReportimg9(String reportimg9) {
        this.reportimg9 = reportimg9;
    }

    public Boolean getIssolve() {
        return issolve;
    }

    public void setIssolve(Boolean issolve) {
        this.issolve = issolve;
    }

    @Override
    public String toString() {
        return "Report{" +
        "reportid=" + reportid +
        ", userid=" + userid +
        ", reporttype=" + reporttype +
        ", reportcontent=" + reportcontent +
        ", reportimg1=" + reportimg1 +
        ", reportimg2=" + reportimg2 +
        ", reportimg3=" + reportimg3 +
        ", reportimg4=" + reportimg4 +
        ", reportimg5=" + reportimg5 +
        ", reportimg6=" + reportimg6 +
        ", reportimg7=" + reportimg7 +
        ", reportimg8=" + reportimg8 +
        ", reportimg9=" + reportimg9 +
        ", issolve=" + issolve +
        "}";
    }

    public Report(Integer userid, String reporttype, String reportcontent, String reportimg1, String reportimg2, String reportimg3, String reportimg4, String reportimg5, String reportimg6, String reportimg7, String reportimg8, String reportimg9) {
        this.userid = userid;
        this.reporttype = reporttype;
        this.reportcontent = reportcontent;
        this.reportimg1 = reportimg1;
        this.reportimg2 = reportimg2;
        this.reportimg3 = reportimg3;
        this.reportimg4 = reportimg4;
        this.reportimg5 = reportimg5;
        this.reportimg6 = reportimg6;
        this.reportimg7 = reportimg7;
        this.reportimg8 = reportimg8;
        this.reportimg9 = reportimg9;
    }
}
