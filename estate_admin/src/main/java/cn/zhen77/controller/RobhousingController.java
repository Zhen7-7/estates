package cn.zhen77.controller;


import cn.zhen77.pojo.Robhousing;
import cn.zhen77.returnJson.ReturnObject;
import cn.zhen77.service.RobhousingService;
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
@RequestMapping("/robhousing")
public class RobhousingController {
    @Autowired
    private RobhousingService robhousingService;
    @RequestMapping("/getAllRobHousing")
    public String getAllRobHousing(){
        List<Robhousing> allRob = robhousingService.getAllRob();
        ReturnObject returnObject = new ReturnObject(allRob);
        return JSONObject.toJSONString(returnObject);
    }
    @RequestMapping("insertRobhousing")
    public String insertRobhousing(String robtype, String estatename, String estateaddress, Double estateprice, Double roballprice, Double robdiscount, Integer robarea, String robbuildingid, String robunitid, String robroomid, String robphone, String information, String reason, Integer lastnum, Integer lastday, String robimg) {
        Robhousing robhousing = new Robhousing(robtype, estatename, estateaddress, estateprice, roballprice, robdiscount, robarea, robbuildingid, robunitid, robroomid,  robphone,  information, reason, lastnum, lastday, robimg);
        boolean b = robhousingService.insertRob(robhousing);
        ReturnObject returnObject = new ReturnObject(b);
        return JSONObject.toJSONString(returnObject);
    }

}

