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
    @RequestMapping("/getAllUserinfo")
    public String getAllUSerInfo(){
        List<User> list = userService.getAllUserinfo();
        ReturnObject returnObject = new ReturnObject(list);
        return JSONObject.toJSONString(returnObject);
    }
}

