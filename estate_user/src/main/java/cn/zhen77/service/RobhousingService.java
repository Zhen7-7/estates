package cn.zhen77.service;

import cn.zhen77.mapper.RobhousingMapper;
import cn.zhen77.pojo.Robhousing;
import cn.zhen77.service.RobhousingService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-15
 */
@Service
public class RobhousingService  {
    @Autowired
    RobhousingMapper robhousingMapper;
    public List<Robhousing> getAllRobhousing(){
        List<Robhousing> robhousings = robhousingMapper.selectAll();
        return robhousings;
    }
}
