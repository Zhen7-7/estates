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
 * @since 2021-04-20
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 管理员id
     */
    @TableId(value = "adminid", type = IdType.AUTO)
    private Integer adminid;

    /**
     * 管理员登录名
     */
    private String adminname;

    /**
     * 管理员登陆密码
     */
    private String adminpassword;

    /**
     * 管理员所属公司
     */
    private String admincompany;

    /**
     * 管理员真实姓名
     */
    private String adminrealname;

    /**
     * 管理员联系电话
     */
    private String adminphone;


    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    public String getAdmincompany() {
        return admincompany;
    }

    public void setAdmincompany(String admincompany) {
        this.admincompany = admincompany;
    }

    public String getAdminrealname() {
        return adminrealname;
    }

    public void setAdminrealname(String adminrealname) {
        this.adminrealname = adminrealname;
    }

    public String getAdminphone() {
        return adminphone;
    }

    public void setAdminphone(String adminphone) {
        this.adminphone = adminphone;
    }

    @Override
    public String toString() {
        return "Admin{" +
        "adminid=" + adminid +
        ", adminname=" + adminname +
        ", adminpassword=" + adminpassword +
        ", admincompany=" + admincompany +
        ", adminrealname=" + adminrealname +
        ", adminphone=" + adminphone +
        "}";
    }
}
