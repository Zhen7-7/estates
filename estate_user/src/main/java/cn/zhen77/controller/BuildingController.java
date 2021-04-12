package cn.zhen77.controller;

import cn.zhen77.pojo.Building;
import cn.zhen77.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/12 - 04 - 12 - 18:18
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@RestController
public class BuildingController {
    @Autowired
    BuildingService buildingService;

    @RequestMapping("/getBuilding")
    public List<Building> getBuilding(Integer estateid){
        List<Building> list = buildingService.getAllBuilding(estateid);
        return list;
    }
}
