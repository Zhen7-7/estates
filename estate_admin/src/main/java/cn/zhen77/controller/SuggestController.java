package cn.zhen77.controller;


import cn.zhen77.pojo.Suggest;
import cn.zhen77.returnJson.ReturnObject;
import cn.zhen77.service.SuggestService;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
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
@RequestMapping("/suggest")
public class SuggestController {
    @Autowired
    private SuggestService suggestService;

    @RequestMapping("/updateSuggest")
    public String alterSuggest(Integer suggestid){
        Boolean result = suggestService.updateSuggest(suggestid);
        ReturnObject returnObject = new ReturnObject(result);
        return JSONObject.toJSONString(returnObject);
    }
    @RequestMapping("/deleteSuggest")
    public String deleteSuggest(Integer suggestid){
        boolean b = suggestService.deleSuggest(suggestid);
        ReturnObject returnObject = new ReturnObject(b);
        return JSONObject.toJSONString(returnObject);

    }
    @RequestMapping("/getAllSuggest")
    public String getAllSuggest(){
        List<Suggest> notresolve = suggestService.notresolve(false);
        List<Suggest> yesresolve = suggestService.notresolve(true);
        Map<String,Object> map = new HashMap<>();
        map.put("notresolve",notresolve);
        map.put("yesresolve",yesresolve);
        ReturnObject returnObject = new ReturnObject(map);
        return JSONObject.toJSONString(returnObject);
    }

}

