package cn.zhen77.controller;

import cn.zhen77.mapper.HousingMapper;
import cn.zhen77.pojo.Housing;
import cn.zhen77.service.HousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhen77
 * @date: 2021/4/14 - 04 - 14 - 21:42
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@RestController
public class HousingController {
    @Autowired
    private HousingService housingService;

    @RequestMapping("/getHousing")
    public Housing getHousing(Integer buildingid){
        Housing housing = housingService.getHousingDetails(buildingid);
        return housing;
    }
}
