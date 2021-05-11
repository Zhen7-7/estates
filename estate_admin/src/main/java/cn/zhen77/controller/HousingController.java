package cn.zhen77.controller;


import cn.zhen77.mapper.HousingimgMapper;
import cn.zhen77.pojo.Housing;
import cn.zhen77.pojo.Housingimg;
import cn.zhen77.returnJson.ReturnObject;
import cn.zhen77.service.HousingService;
import cn.zhen77.service.HousingimgService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
@RequestMapping("/housing")
public class HousingController {
    @Autowired
    private HousingService housingService;
    @Autowired
    private HousingimgService housingimgService;

    @RequestMapping("/getHousingByHousingid")
    public String getHousingByhousingid(Integer housingid){
        Housing housing = housingService.getHousingByHousingid(housingid);
        Integer img = housing.getHousingimgid();
        Housingimg getimg = housingimgService.getimg(img);
        Map<String, Object> map = new HashMap<>();
        map.put("Housing",housing);
        map.put("housingimg",getimg);
        return JSONObject.toJSONString(new ReturnObject(map));
    }
    @RequestMapping("/insertHousing")
    public String insertHousing(Integer buildingid,  String housingtype, Integer housingarea, Integer housingrealarea, Double housingprice, Integer housingunit, Integer housingroom,String housingimg1, String housingimg2, String housingimg3, String housingimg4, String housingimg5) {
        Housingimg housingimg = new Housingimg( housingimg1, housingimg2,  housingimg3, housingimg4,  housingimg5);
        Integer insertimg = housingimgService.insertimg(housingimg);
        Integer housingimgid = housingimgService.getHousingid(housingimg1, housingimg2, housingimg3, housingimg4, housingimg5);


        Housing housing = new Housing(buildingid,housingimgid, housingtype,housingarea, housingrealarea, housingprice, housingunit, housingroom) ;
        Integer i = housingService.insertHouising(housing);
        if (i==1){
            return "success";

        }else{
            return "false";
        }

    }
}

