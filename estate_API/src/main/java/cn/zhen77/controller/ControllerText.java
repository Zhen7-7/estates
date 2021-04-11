package cn.zhen77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : zhen77
 * @date: 2021/4/8 - 04 - 08 - 19:40
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@RestController
public class ControllerText {
    @RequestMapping("/user")
    public Map<String,Object> getUser(){
        System.out.println("微信小程序正在被调用");
        Map<String, Object> map = new HashMap<>();
        List<String> list  = new ArrayList<>();
        list.add("常铭");
        list.add("孙朕");
        list.add("东北农业大学");
        map.put("list",list);
        System.out.println("小程序调用完成");
        return map;

    }
    @RequestMapping("getWord")
    public Map<String, Object> getText(String word){
        Map<String, Object> map = new HashMap<String, Object>();
        String message = "你他吗输入啊";
        if ("孙朕".equals(word)) {
            message="孙朕真他妈帅啊";
        }else if("常铭".equals(word)){
            message= "别说了，孱弱公务员";
        }else if("东北农业大学".equals(word)){
            message="东北农业大学是一所“以农科为优势，以生命科学和食品科学为特色，农、工、理、经、管等多学科协调发展”的国家“211工程”重点建设大学和“世界一流学科”建设高校，是黑龙江省人民政府与农业农村部省部共建大学、国家“中西部高校基础能力建设工程”项目入选高校、教育部本科教学工作水平评估优秀院校。";
        }
        map.put("message", message);
        return map;
    }
}
