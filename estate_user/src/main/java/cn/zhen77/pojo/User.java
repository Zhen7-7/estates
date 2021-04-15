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
 * @since 2021-04-15
 */
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
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 真是姓名
     */
    private String realname;

    /**
     * 身份证号
     */
    private String identity;

    /**
     * 地址
     */
    private String address;

    public User() {
    }

    public User(String username, String password, String phone, String realname, String identity, String address) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.realname = realname;
        this.identity = identity;
        this.address = address;
    }

    public User(Integer userid, String username, String password, String phone, String realname, String identity, String address) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.realname = realname;
        this.identity = identity;
        this.address = address;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
        "userid=" + userid +
        ", username=" + username +
        ", password=" + password +
        ", phone=" + phone +
        ", realname=" + realname +
        ", identity=" + identity +
        ", address=" + address +
        "}";
    }
}
