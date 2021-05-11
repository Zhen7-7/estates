package cn.zhen77.controller;


import cn.zhen77.pojo.Building;
import cn.zhen77.returnJson.ReturnObject;
import cn.zhen77.service.BuildingService;
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
@RequestMapping("/building")
public class BuildingController {
    @Autowired
    private BuildingService buildingService;
    @RequestMapping("/getBuildingByEstateid")
    public String getBuildingByEstateid(Integer estateid){
        List<Building> buildings = buildingService.selectAllBuildingByEstateid(estateid);
        ReturnObject returnObject = new ReturnObject(buildings);
        return JSONObject.toJSONString(returnObject);
    }
    @RequestMapping("/insertBuilding")
    public String insertBuilding(Integer estateid, String buildingimg, Integer housingunitnum, Integer buildingfloornum){
        Building building = new Building(estateid, buildingimg,housingunitnum, buildingfloornum);
        boolean insert = buildingService.insert(building);
        return JSONObject.toJSONString(new ReturnObject(insert));
    }

}

