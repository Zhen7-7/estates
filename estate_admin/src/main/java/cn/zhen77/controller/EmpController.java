package cn.zhen77.controller;

import cn.zhen77.pojo.Emp;
import cn.zhen77.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : zhen77
 * @date: 2021/4/6 - 04 - 06 - 17:58
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/empadd")
    public String empadd(Model model){
        model.addAttribute("list",empService.findAllEmp());
        return "emp-add";
    }
    @RequestMapping("/add")
    public String add(Emp emp, MultipartFile multipartFile){
        empService.insertEmp(emp,multipartFile);
        return "emp-add";
    }
}
