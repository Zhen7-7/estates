package cn.zhen77.controller;

import cn.zhen77.pojoi.Admin;
import cn.zhen77.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : zhen77
 * @date: 2021/3/22 - 03 - 22 - 23:10
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(String usertname, String password, Model model){
        Admin admin = adminService.getAdmin(usertname);
        return admin.getPassword().equals(password)==true?"yes":"no";
    }
}
