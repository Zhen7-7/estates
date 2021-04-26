package cn.zhen77;

import cn.zhen77.mapper.SuggestMapper;
import cn.zhen77.pojo.Suggest;
import cn.zhen77.service.SuggestService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sun.glass.ui.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : zhen77
 * @date: 2021/4/25 - 04 - 25 - 18:12
 * @Description: cn.zhen77
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SuggestTest {
    @Autowired
    private SuggestService suggestService;
    private SuggestMapper suggestMapper;
    @Test
    public void test1(){

        /*Boolean aBoolean = suggestService.updateSuggest(3);
        System.out.println(aBoolean);*/
        /*QueryWrapper<Suggest> queryWrapper = new QueryWrapper<>();

        queryWrapper.eq("suggestid",1);
        Suggest suggest = suggestMapper.selectOne(queryWrapper);
        System.out.println(suggest);*/

    }
}
