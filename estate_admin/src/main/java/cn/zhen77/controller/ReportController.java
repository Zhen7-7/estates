package cn.zhen77.controller;


import cn.zhen77.pojo.Report;
import cn.zhen77.pojo.Suggest;
import cn.zhen77.returnJson.ReturnObject;
import cn.zhen77.service.ReportService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
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
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @RequestMapping("/updateReport")
    public String alterReport(Integer reportid){
        Boolean result = reportService.updateReport(reportid);
        ReturnObject returnObject = new ReturnObject(result);
        return JSONObject.toJSONString(returnObject);
    }
    @RequestMapping("/deleteReport")
    public String deleteReport(Integer reportid){
        boolean b = reportService.deleReport(reportid);
        ReturnObject returnObject = new ReturnObject(b);
        return JSONObject.toJSONString(returnObject);
    }
    @RequestMapping("/getAllReport")
    public String getAllReport(){
        List<Report> notresolve = reportService.notresolve(false);
        List<Report> yesresolve = reportService.notresolve(true);
        Map<String,Object> map = new HashMap<>();
        map.put("notresolve",notresolve);
        map.put("yesresolve",yesresolve);
        ReturnObject returnObject = new ReturnObject(map);
        return JSONObject.toJSONString(returnObject);
    }
}

