package cn.zhen77.service;

import cn.zhen77.mapper.RobhousingMapper;
import cn.zhen77.pojo.Robhousing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/5/6 - 05 - 06 - 20:44
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class RobhousingService {
    @Autowired
    private RobhousingMapper robhousingMapper;
    public List<Robhousing> getAllRob(){
        List<Robhousing> robhousings = robhousingMapper.selectList(null);
        return robhousings;
    }
    public boolean insertRob(Robhousing robhousing){
        int insert = robhousingMapper.insert(robhousing);
        if (insert==1){
            return true;
        }
        else{
            return false;
        }
    }
}
