package cn.zhen77.service;

import cn.zhen77.mapper.EstateMapper;
import cn.zhen77.pojo.Estate;
import cn.zhen77.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/11 - 04 - 11 - 21:22
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class EstateService {
    @Autowired
    private EstateMapper estateMapper;
    public List<Estate> selectAllEstate() {
        List<Estate> list= estateMapper.selectAll();
        return list;
    }
}
