package cn.zhen77.controller;

import cn.zhen77.pojo.Roborder;
import cn.zhen77.returnJson.ReturnObject;
import cn.zhen77.service.RoborderService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/5/6 - 05 - 06 - 20:54
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",methods = {},allowCredentials = "true")
@RequestMapping("/roborder")
public class RoborderController {
    @Autowired
    private RoborderService roborderService;
    @RequestMapping("/getAllRoborder")
    public String getAllRoborder(){
        List<Roborder> allRoborder = roborderService.getAllRoborder();
        ReturnObject returnObject = new ReturnObject(allRoborder);
        return JSONObject.toJSONString(returnObject);
    }


}
