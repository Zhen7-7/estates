package cn.zhen77.controller;

import cn.zhen77.pojo.User;
import cn.zhen77.service.UserService;
import org.apache.el.parser.BooleanNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/10 - 04 - 10 - 11:04
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/register")
    @ResponseBody
    public int register(String username,String password,String phone,String realname,String identity,String address){
        User user = new User("孙朕","123456","132454644","suznhen","46546545465","china");
        User demo = new User(username,password,phone,realname,identity,address);
        Integer result = userService.insertUser(demo);
        System.out.println(result);
        return result;
    }
    @RequestMapping("/loginuser")
    @ResponseBody
    public boolean login(String username, String password){
        System.out.println(username);
        System.out.println(password);
        User user = userService.selectUser(username);
        boolean result = false;
        System.out.println(user.getPassword());
        result = password.equals(user.getPassword());
        System.out.println(result);
        return result;
    }
//    @RequestMapping("/login")
//    @ResponseBody
//    public List<User> login1(){
//        User user = new User();
//        List<User> users = userService.selectUser("admin");
//        return users;
//    }
}