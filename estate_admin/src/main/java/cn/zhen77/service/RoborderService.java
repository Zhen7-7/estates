package cn.zhen77.service;

import cn.zhen77.mapper.RobhousingMapper;
import cn.zhen77.mapper.RoborderMapper;
import cn.zhen77.pojo.Roborder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/5/6 - 05 - 06 - 20:51
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class RoborderService {
    @Autowired
    private RoborderMapper roborderMapper;
    public List<Roborder> getAllRoborder(){
        List<Roborder> roborders = roborderMapper.selectList(null);
        return roborders;
    }
}
