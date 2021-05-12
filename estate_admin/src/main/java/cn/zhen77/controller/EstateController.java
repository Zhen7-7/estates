package cn.zhen77.controller;


import cn.zhen77.mapper.EstateMapper;
import cn.zhen77.pojo.Estate;
import cn.zhen77.returnJson.ReturnObject;
import cn.zhen77.service.EstateService;
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
@RequestMapping("/estate")
public class EstateController {
    @Autowired
    private EstateService estateService;


    //新增房产
    @RequestMapping("/addEstate")
    public String addEstate (String estatename, String estateimg, String estateaddress, Integer estateallnum, Integer estatelastnum, String company, Integer buildingnum, Double price, String city){
        Estate estate = new Estate(estatename, estateimg, estateaddress, estateallnum, estatelastnum, company, buildingnum, price, city);
        boolean b = estateService.insertEstate(estate);
        ReturnObject returnObject = new ReturnObject(b);
        return JSONObject.toJSONString(returnObject);
    }
    //删除该房产
    @RequestMapping("/deleteEstate")
    public String delEstate(Integer estateid){
        boolean b = estateService.delEstate(estateid);
        ReturnObject returnObject = new ReturnObject(b);
        return JSONObject.toJSONString(returnObject);
    }
    //更新房产信息
    @RequestMapping("/updateEstate")
    public String addEstate (Integer estateid,String estatename, String estateimg, String estateaddress, Integer estateallnum, Integer estatelastnum, String company, Integer buildingnum, Double price, String city){
        Estate estate = new Estate( estateid,estatename, estateimg, estateaddress, estateallnum, estatelastnum, company, buildingnum, price, city);
        boolean b = estateService.updateEstate(estate);
        ReturnObject returnObject = new ReturnObject(b);
        return JSONObject.toJSONString(returnObject);
    }
    //查看全部房产
    @RequestMapping("/getAllEstate")
    public String getAllEstate(){
        List<Estate> list = estateService.selectAllEstate();
        ReturnObject returnObject = new ReturnObject(list);
        return JSONObject.toJSONString(returnObject);
    }
    //查看某一房产
    @RequestMapping("/getOneEstate")
    public String getOneEstate(Integer estateid){
        Estate estate = estateService.selectEstate(estateid);
        ReturnObject returnObject = new ReturnObject(estate);
        return JSONObject.toJSONString(returnObject);
    }

}

