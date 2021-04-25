package cn.zhen77.service;

import cn.zhen77.mapper.SuggestMapper;
import cn.zhen77.pojo.Suggest;
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
    public List<Suggest> getAllSuggest(){
        List<Suggest> suggests = suggestMapper.selectList(null);
        return suggests;
    }
}
