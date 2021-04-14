package cn.zhen77.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author : zhen77
 * @date: 2021/4/10 - 04 - 10 - 10:35
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
@TableName("user")
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private String username;
    private int userid;
    private String password;
    private String phone;
    private String realname;
    private String identity;
    private String address;


    public User( String username, String password, String phone, String realname, String identity, String address) {

        this.username = username;
        this.password = password;
        this.phone = phone;
        this.realname = realname;
        this.identity = identity;
        this.address = address;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", realname='" + realname + '\'' +
                ", identity='" + identity + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return userid;
    }

    public void setId(int id) {
        this.userid = id;
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
}
