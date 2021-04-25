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
 * @since 2021-04-25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户id
     */
    @TableId(value = "userid", type = IdType.AUTO)
    private Integer userid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 真实姓名 
     */
    private String realname;

    /**
     * 身份证号
     */
    private String identity;

    /**
     * 地址
     */
    private String city;

    /**
     * 性别
     */
    private String gender;

    /**
     * 用户头像
     */
    private String headimg;

    public User(String username, String phone, String realname, String identity, String city, String gender, String headimg) {
        this.username = username;
        this.phone = phone;
        this.realname = realname;
        this.identity = identity;
        this.city = city;
        this.gender = gender;
        this.headimg = headimg;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    @Override
    public String toString() {
        return "User{" +
        "userid=" + userid +
        ", username=" + username +
        ", phone=" + phone +
        ", realname=" + realname +
        ", identity=" + identity +
        ", city=" + city +
        ", gender=" + gender +
        ", headimg=" + headimg +
        "}";
    }
}
