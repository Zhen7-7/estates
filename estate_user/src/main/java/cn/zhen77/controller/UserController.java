package cn.zhen77.controller;

import cn.zhen77.pojo.User;
import cn.zhen77.service.UserService;
import org.apache.el.parser.BooleanNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/10 - 04 - 10 - 11:04
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/register")

    public User register(String username,String phone,String realname,String identity,String address,String gender,String headimg){
//        User user = new User("孙朕","123456","132454644","suznhen","46546545465","china");
        User demo = new User(username,phone,realname,identity,address,gender,headimg);
        Integer result = userService.insertUser(demo);
        if(result==1) {
            User user = userService.selectUser(username);
            return user;
        }else {
            return null;
        }
    }

    @RequestMapping("/getUser")
    public User getUser(String username){
        User user = userService.selectUser(username);
        return user;
    }

}
