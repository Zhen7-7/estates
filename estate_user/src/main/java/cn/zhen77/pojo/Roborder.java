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
 * @since 2021-04-27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roborder implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 预订订单号
     */
    @TableId(value = "roborderid", type = IdType.AUTO)
    private Integer roborderid;

    /**
     * 预订小区号
     */
    private Integer robid;

    /**
     * 预订者id
     */
    private Integer userid;

    /**
     * 几号楼
     */
    private Integer robbuildingid;

    /**
     * 几单元
     */
    private Integer robunitid;

    /**
     * 房间号
     */
    private Integer robroom;

    /**
     * 用户名
     */
    private String username;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 享受优惠
     */
    private Double discount = 0.8;

    public Roborder(Integer robid, Integer userid, Integer robbulidingid, Integer robunitid, Integer robroom, String username, String phone, Double discount) {
        this.robid = robid;
        this.userid = userid;
        this.robbuildingid = robbulidingid;
        this.robunitid = robunitid;
        this.robroom = robroom;
        this.username = username;
        this.phone = phone;
        this.discount = discount;
    }

    public Integer getRoborderid() {
        return roborderid;
    }

    public void setRoborderid(Integer roborderid) {
        this.roborderid = roborderid;
    }

    public Integer getRobid() {
        return robid;
    }

    public void setRobid(Integer robid) {
        this.robid = robid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRobbuildingid() {
        return robbuildingid;
    }

    public void setRobbuildingid(Integer robbuildingid) {
        this.robbuildingid = robbuildingid;
    }

    public Integer getRobunitid() {
        return robunitid;
    }

    public void setRobunitid(Integer robunitid) {
        this.robunitid = robunitid;
    }

    public Integer getRobroom() {
        return robroom;
    }

    public void setRobroom(Integer robroom) {
        this.robroom = robroom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Roborder(Integer robid, Integer userid, Integer robbuildingid, Integer robunitid, Integer robroom, String username, String phone) {
        this.robid = robid;
        this.userid = userid;
        this.robbuildingid = robbuildingid;
        this.robunitid = robunitid;
        this.robroom = robroom;
        this.username = username;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Roborder{" +
        "roborderid=" + roborderid +
        ", robid=" + robid +
        ", userid=" + userid +
        ", robbulidingid=" + robbuildingid +
        ", robunitid=" + robunitid +
        ", robroom=" + robroom +
        ", username=" + username +
        ", phone=" + phone +
        ", discount=" + discount +
        "}";
    }
}
