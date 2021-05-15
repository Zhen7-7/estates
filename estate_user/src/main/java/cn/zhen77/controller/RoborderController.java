package cn.zhen77.controller;


import cn.zhen77.pojo.Roborder;
import cn.zhen77.pojo.User;
import cn.zhen77.service.RoborderService;
import cn.zhen77.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-27
 */
@RestController

public class RoborderController {
    @Autowired
    private RoborderService roborderService;
    @Autowired
    private UserService userService;
    //插入roborder 前端传来robid
    @RequestMapping("/sendRob")
    public boolean addRob(Integer userid,Integer robid){
        User user = userService.selectUserByid(userid);
        String username = user.getUsername();
        String phone = user.getPhone();
        double discount = 0.8;
        int robbuildingid =0, robunitid=0 ,floor = 0, robroom=0;
        init(robbuildingid , robunitid ,floor , robroom);

        Roborder roborder = new Roborder(robid,userid,robbuildingid,robunitid,robroom,username,phone,discount);
        Boolean aBoolean = roborderService.insertRoborder(roborder);
        return aBoolean;
    }

    public static void init(int buildingid ,int unitid, int floor,int room  ){
        Random random = new Random();
        buildingid = random.nextInt(5);
        unitid = random.nextInt(5);
        floor= random.nextInt(23);
        room = floor*100 + random.nextInt(3);
    }
}

