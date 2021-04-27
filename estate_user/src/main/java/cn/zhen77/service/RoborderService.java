package cn.zhen77.service;

import cn.zhen77.mapper.RoborderMapper;
import cn.zhen77.pojo.Roborder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : zhen77
 * @date: 2021/4/27 - 04 - 27 - 8:47
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class RoborderService {
    @Autowired
    private RoborderMapper roborderMapper;
    //插入
    public Boolean insertRoborder(Roborder roborder){
        int insert = roborderMapper.insert(roborder);
        if (insert==1) return true;
        else return false;
    }
}
