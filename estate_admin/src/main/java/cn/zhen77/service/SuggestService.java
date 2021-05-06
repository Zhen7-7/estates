package cn.zhen77.service;

import cn.zhen77.mapper.SuggestMapper;
import cn.zhen77.pojo.Suggest;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/25 - 04 - 25 - 11:04
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class SuggestService {
    @Autowired
    private SuggestMapper suggestMapper;

    //查看所有意见反馈
    public List<Suggest> getAllSuggest(){
        List<Suggest> suggests = suggestMapper.selectList(null);
        return suggests;
    }
    //修改部分意见反馈
    public Boolean updateSuggest(Integer suggestid){
        Suggest suggest = suggestMapper.selectById(suggestid);
        suggest.setIssolve(true);
        int i = suggestMapper.updateById(suggest);
        if (i==1){
            return true;
        }else {
            return false;
        }
    }
    //查看未采纳的
    public List<Suggest> notresolve(boolean issolve){
        QueryWrapper<Suggest> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("issolve",issolve);
        List<Suggest> suggests = suggestMapper.selectList(queryWrapper);
        return suggests;
    }
    //删除
    public boolean deleSuggest(Integer suggestid){
        int i = suggestMapper.deleteById(suggestid);
        if (i==1){
            return true;
        }else {
            return false;
        }

    }

}
