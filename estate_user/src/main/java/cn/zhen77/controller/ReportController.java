package cn.zhen77.controller;



import cn.zhen77.commen.ImgList;
import cn.zhen77.pojo.Report;
import cn.zhen77.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-21
 */
@RestController

public class ReportController {
    @Autowired
    ReportService reportService;
    @RequestMapping("/insertReport")
    public Report insertReport(Integer userid, String reporttype, String reportcontent, @RequestParam List<String> list){
       /* int length = list.size();
        List<String> temp = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            if(i<length)temp.add(list.get(i));
            else temp.add(null);
        }*/
        List<String> temp = ImgList.getImgList(list, 9);
        Report report = new Report( userid ,reporttype,reportcontent,temp.get(0), temp.get(1), temp.get(2), temp.get(3), temp.get(4), temp.get(5), temp.get(6), temp.get(7), temp.get(8));
        Integer integer = reportService.insert(report);
        if (integer==1) {
            System.out.println("success");
            return report;
        }
        else {return null;}
    }
}

