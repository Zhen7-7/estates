package cn.zhen77.controller;


import cn.zhen77.pojo.User;
import cn.zhen77.returnJson.ReturnObject;
import cn.zhen77.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-24
 */
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",methods = {},allowCredentials = "true")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getAllUserInfo")
    public String getAllUSerInfo(){
        List<User> list = userService.getAllUserInfo();
        ReturnObject returnObject = new ReturnObject(list);
        return JSONObject.toJSONString(returnObject);
    }

    @RequestMapping("/updateUserInfo")
    public String updateUserInfo(Integer userid,String username,String phone,String realname,String identity,String address,String gender,String headimg){
//        User user = new User("孙朕","123456","132454644","suznhen","46546545465","china");
        User user = new User(userid,username,phone,realname,identity,address,gender,headimg);
        boolean  result = userService.updateUserInfo(user);
        ReturnObject returnObject = new ReturnObject(result);
        return JSONObject.toJSONString(returnObject);
    }
    @RequestMapping("/deleteUserInfo")
    public String del(Integer userid){
        boolean result = userService.delUserINfo(userid);
        ReturnObject returnObject = new ReturnObject(result);
        return JSONObject.toJSONString(returnObject);
    }
}

