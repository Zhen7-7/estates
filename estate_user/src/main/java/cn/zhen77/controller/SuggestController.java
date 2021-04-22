package cn.zhen77.controller;


import cn.zhen77.commen.ImgList;
import cn.zhen77.pojo.Suggest;
import cn.zhen77.service.SuggestService;
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

public class SuggestController {

    @Autowired
    SuggestService suggestService;

    @RequestMapping("/insertSuggest")
    public Suggest insertSuggest (String suggesttype, String suggestcontent, Integer userid, @RequestParam List<String> list) {
        System.out.println(suggestcontent);
        List<String> temp = ImgList.getImgList(list, 9);
        Suggest suggest = new Suggest(suggesttype, suggestcontent, userid, temp.get(0), temp.get(1), temp.get(2), temp.get(3), temp.get(4), temp.get(5), temp.get(6), temp.get(7), temp.get(8));
        System.out.println(suggest);
        Integer integer = suggestService.insert(suggest);
        if (integer == 1) {
            return suggest;
        } else {
            return null;
        }
    }
}



