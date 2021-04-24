package cn.zhen77.controller;


import cn.zhen77.pojo.Robhousing;
import cn.zhen77.service.RobhousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-15
 */
@RestController

public class RobhousingController {
    @Autowired
    RobhousingService robhousingService;
    @RequestMapping("/getRobhousing")
    public List<Robhousing> getallrob(){
        List<Robhousing> allRobhousing = robhousingService.getAllRobhousing();
        return allRobhousing;
    }
}

