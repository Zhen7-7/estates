package cn.zhen77.service;

import cn.zhen77.mapper.SuggestMapper;
import cn.zhen77.pojo.Suggest;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-21
 */
@Service
public class SuggestService {
    @Autowired
    SuggestMapper suggestMapper;

    public Suggest getSuggest(Integer userid){
        QueryWrapper<Suggest> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userid",userid);
        return suggestMapper.selectOne(queryWrapper);
    }
    public Integer insert(Suggest suggest){
        //定义查询包装类
        int insert = suggestMapper.insert(suggest);
        return insert;
    }


}
