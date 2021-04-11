package cn.zhen77.controller;

import cn.zhen77.pojo.Estate;
import cn.zhen77.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/11 - 04 - 11 - 21:29
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@RestController
public class EstateController {
    @Autowired
    private EstateService estateService;
    @RequestMapping("/getAllEstate")
    public List<Estate> selectAllEstate(){
        List<Estate> list = estateService.selectAllEstate();
        return list;
    }
}
