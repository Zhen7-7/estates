package cn.zhen77.pojoi;

import com.baomidou.mybatisplus.annotation.TableName;

import javax.naming.Name;

/**
 * @author : zhen77
 * @date: 2021/3/22 - 03 - 22 - 22:46
 * @Description: cn.zhen77.pojoi
 * @version: 1.0
 */
@TableName("t_admin")
public class Admin {
    private Integer id;
    private String name;
    private String password;

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Admin() {
    }
}
