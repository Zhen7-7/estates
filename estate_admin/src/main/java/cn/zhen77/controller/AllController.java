package cn.zhen77.controller;

import cn.zhen77.pojo.*;
import cn.zhen77.returnJson.ReturnObject;
import cn.zhen77.service.BuildingService;
import cn.zhen77.service.EstateService;
import cn.zhen77.service.HousingService;
import cn.zhen77.service.HousingimgService;
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
 * @date: 2021/5/12 - 05 - 12 - 9:53
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",methods = {},allowCredentials = "true")
@RequestMapping("/all")
public class AllController {
    @Autowired
    private EstateService estateService;
    @Autowired
    private BuildingService buildingService;
    @Autowired
    private HousingService housingService;
    @Autowired
    private HousingimgService housingimgService;

    //查
    @RequestMapping("/getAllInfo")
    public String getallinfo(Integer estateid){
        Map<String, Object> map = new HashMap<>();
        Estate estate = estateService.selectEstate(estateid);
        map.put("estate",estate);
        List<Building> buildings = buildingService.selectAllBuildingByEstateid(estateid);
        map.put("building",buildings);
        for(Building building:buildings){
            List<HousingInfo> housingInfos = new ArrayList<>();
            List<Housing> list = housingService.getHousingsByBuildingid(building.getBuildingid());
            for(Housing housing:list){
                Housingimg getimg = housingimgService.getimg(housing.getHousingimgid());
                housingInfos.add(new HousingInfo(housing,getimg));
            }
            map.put("building"+building.getBuildingid().toString(),housingInfos);
        }
        return JSONObject.toJSONString(new ReturnObject(map));
    }
    @RequestMapping("/test")
    public  String test (Integer estateid){
        List<Building> buildings = buildingService.selectAllBuildingByEstateid(estateid);
        return JSONObject.toJSONString(new ReturnObject(buildings));
    }
}
