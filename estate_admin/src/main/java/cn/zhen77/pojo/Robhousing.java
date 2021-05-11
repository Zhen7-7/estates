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
public class Robhousing implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 抢购房id
     */
    @TableId(value = "robid", type = IdType.AUTO)
    private Integer robid;

    /**
     * 抢购房类型（几室几厅）
     */
    private String robtype;

    /**
     * 房地产名
     */
    private String estatename;

    /**
     * 地址
     */
    private String estateaddress;

    /**
     * 所属楼盘id
     */
    private Integer estateid;

    /**
     * 房产均价
     */
    private Double estateprice;

    /**
     * 总价
     */
    private Double roballprice;

    /**
     * 折扣
     */
    private Double robdiscount;

    /**
     * 面积
     */
    private Integer robarea;

    /**
     * 楼号（几号楼）
     */
    private String robbuildingid;

    /**
     * 单元号（几单元）
     */
    private String robunitid;

    /**
     * 房间号
     */
    private String robroomid;

    /**
     * 联系电话
     */
    private String robphone;

    /**
     * 信息
     */
    private String information;

    /**
     * 推荐原因
     */
    private String reason;

    /**
     * 剩余户数
     */
    private Integer lastnum;

    /**
     * 剩余天数
     */
    private Integer lastday;

    /**
     * 一张图片
     */
    private String robimg;

    public Robhousing(String robtype, String estatename, String estateaddress, Double estateprice, Double roballprice, Double robdiscount, Integer robarea, String robbuildingid, String robunitid, String robroomid, String robphone, String information, String reason, Integer lastnum, Integer lastday, String robimg) {
        this.robtype = robtype;
        this.estatename = estatename;
        this.estateaddress = estateaddress;
        this.estateprice = estateprice;
        this.roballprice = roballprice;
        this.robdiscount = robdiscount;
        this.robarea = robarea;
        this.robbuildingid = robbuildingid;
        this.robunitid = robunitid;
        this.robroomid = robroomid;
        this.robphone = robphone;
        this.information = information;
        this.reason = reason;
        this.lastnum = lastnum;
        this.lastday = lastday;
        this.robimg = robimg;
    }

    public Integer getRobid() {
        return robid;
    }

    public void setRobid(Integer robid) {
        this.robid = robid;
    }

    public String getRobtype() {
        return robtype;
    }

    public void setRobtype(String robtype) {
        this.robtype = robtype;
    }

    public String getEstatename() {
        return estatename;
    }

    public void setEstatename(String estatename) {
        this.estatename = estatename;
    }

    public String getEstateaddress() {
        return estateaddress;
    }

    public void setEstateaddress(String estateaddress) {
        this.estateaddress = estateaddress;
    }

    public Integer getEstateid() {
        return estateid;
    }

    public void setEstateid(Integer estateid) {
        this.estateid = estateid;
    }

    public Double getEstateprice() {
        return estateprice;
    }

    public void setEstateprice(Double estateprice) {
        this.estateprice = estateprice;
    }

    public Double getRoballprice() {
        return roballprice;
    }

    public void setRoballprice(Double roballprice) {
        this.roballprice = roballprice;
    }

    public Double getRobdiscount() {
        return robdiscount;
    }

    public void setRobdiscount(Double robdiscount) {
        this.robdiscount = robdiscount;
    }

    public Integer getRobarea() {
        return robarea;
    }

    public void setRobarea(Integer robarea) {
        this.robarea = robarea;
    }

    public String getRobbuildingid() {
        return robbuildingid;
    }

    public void setRobbuildingid(String robbuildingid) {
        this.robbuildingid = robbuildingid;
    }

    public String getRobunitid() {
        return robunitid;
    }

    public void setRobunitid(String robunitid) {
        this.robunitid = robunitid;
    }

    public String getRobroomid() {
        return robroomid;
    }

    public void setRobroomid(String robroomid) {
        this.robroomid = robroomid;
    }

    public String getRobphone() {
        return robphone;
    }

    public void setRobphone(String robphone) {
        this.robphone = robphone;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getLastnum() {
        return lastnum;
    }

    public void setLastnum(Integer lastnum) {
        this.lastnum = lastnum;
    }

    public Integer getLastday() {
        return lastday;
    }

    public void setLastday(Integer lastday) {
        this.lastday = lastday;
    }

    public String getRobimg() {
        return robimg;
    }

    public void setRobimg(String robimg) {
        this.robimg = robimg;
    }

    @Override
    public String toString() {
        return "Robhousing{" +
        "robid=" + robid +
        ", robtype=" + robtype +
        ", estatename=" + estatename +
        ", estateaddress=" + estateaddress +
        ", estateid=" + estateid +
        ", estateprice=" + estateprice +
        ", roballprice=" + roballprice +
        ", robdiscount=" + robdiscount +
        ", robarea=" + robarea +
        ", robbuildingid=" + robbuildingid +
        ", robunitid=" + robunitid +
        ", robroomid=" + robroomid +
        ", robphone=" + robphone +
        ", information=" + information +
        ", reason=" + reason +
        ", lastnum=" + lastnum +
        ", lastday=" + lastday +
        ", robimg=" + robimg +
        "}";
    }
}
