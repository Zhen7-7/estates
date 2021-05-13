package cn.zhen77.controller;

import cn.zhen77.pojo.Robhousing;
import cn.zhen77.pojo.Roborder;
import cn.zhen77.pojo.User;
import cn.zhen77.returnJson.ReturnObject;
import cn.zhen77.service.RobhousingService;
import cn.zhen77.service.RoborderService;
import cn.zhen77.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private RobhousingService robhousingService;
    @Autowired
    private UserService userService;

//    @RequestMapping("/getAllRoborder")
////    public String getAllRoborder(){
////        List<Roborder> allRoborder = roborderService.getAllRoborder();
////        ReturnObject returnObject = new ReturnObject(allRoborder);
////        return JSONObject.toJSONString(returnObject);
////    }

    //获取前部的Roborder
    @RequestMapping("/getAllRoborder")
    public String getAllRoborder(){
        List<Roborder> allRoborder = roborderService.getAllRoborder();
        ArrayList list = new ArrayList();
        for (Roborder roborder:allRoborder){
            Map<String, Object> map = new HashMap<>();
            map.put("roborderid",roborder.getRobbuildingid());
            map.put("rob",robhousingService.getRobByRobid(roborder.getRobid()));
            map.put("user",userService.selectUserByUserid(roborder.getUserid()));
            map.put("room",roborder.getRobbuildingid().toString()+"号楼"+roborder.getRobunitid().toString()+"单元"+roborder.getRobroom().toString());
            map.put("phone",roborder.getPhone());
            map.put("discount",roborder.getDiscount());
            list.add(map);
        }
        return JSONObject.toJSONString(new ReturnObject(list));
    }



}
