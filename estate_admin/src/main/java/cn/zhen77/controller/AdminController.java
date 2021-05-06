package cn.zhen77.controller;


import cn.zhen77.pojo.Admin;
import cn.zhen77.returnJson.ReturnObject;
import cn.zhen77.returnJson.UserInfo;
import cn.zhen77.service.AdminService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-20
 */
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",methods = {},allowCredentials = "true")
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping("/getAdmin")
    public String login(@RequestParam("adminname") String adminname, @RequestParam("adminpassword") String adminpassword, HttpSession session){
        Admin returnadmin = adminService.getAdminInfo(adminname);
        Admin returnadmin1 = adminService.getAdminInfo("admin1");
        List<Admin> list = new ArrayList<>();
        list.add(returnadmin);
        list.add(returnadmin1);
        //将用户数据写入到session中
//        session.setAttribute("admin",returnadmin);
//        ReturnObject returnObject = new ReturnObject(returnadmin);//设计模式
//        return JSONObject.toJSONString(returnObject);
        ReturnObject returnObject = new ReturnObject(list);//设计模式
        return JSONObject.toJSONString(returnObject);

    }
    @RequestMapping("/test")
    public String test(  HttpSession session){
        Admin returnadmin = adminService.getAdminInfo("admin");
        //将用户数据写入到session中
        session.setAttribute("admin",returnadmin);
        ReturnObject returnObject = new ReturnObject(returnadmin);//设计模式
        return JSONObject.toJSONString(returnObject);

    }

   /* @RequestMapping("/user/info")
    public String getInfo(HttpSession session){//共享session数据
        TblUserRecord tblUserRecord = (TblUserRecord)session.getAttribute("userRecord");
        //获取模块信息用"-"拼接
        String[] split = tblUserRecord.getTblRole().getRolePrivileges().split("-");
        //创建权限集合对象
        Permissions permissions = new Permissions();
        //向集合对象中添加具体的权限
        List<Permission> permissionList = new ArrayList<>();
        for (String s : split) {
            permissionList.add(new Permission(s));
        }
        permissions.setPermissions(permissionList);
        //设置返回值的result
        UserInfo userInfo = new UserInfo(tblUserRecord.getUserName(), permissions);
        return JSONObject.toJSONString(new ReturnObject(userInfo));

    }*/
    @RequestMapping("/auth/logout")
    public String logOut(HttpSession session){
        System.out.println("退出登录");
        session.invalidate();//使session无效
//        return JSONObject.toJSONString(new ReturnObject(null));
        return "";
    }
    //getAllAdmin
    @RequestMapping("/getAllAdminInfo")
    public String getAllAdminInfo(){
        List<Admin> allAdmin = adminService.getAllAdmin();
        ReturnObject returnObject = new ReturnObject(allAdmin);
        return JSONObject.toJSONString(returnObject);
    }

}

