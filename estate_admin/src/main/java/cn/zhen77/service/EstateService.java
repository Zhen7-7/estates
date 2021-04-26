package cn.zhen77.service;

import cn.zhen77.mapper.EstateMapper;
import cn.zhen77.pojo.Estate;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/26 - 04 - 26 - 15:43
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class EstateService {
    @Autowired
    private EstateMapper estateMapper;

    //插入房产 增
    public boolean insertEstate(Estate estate){
        int i = estateMapper.insert(estate);
        if (i==1) return true;
        else  return false;
    }
    //删除房产
    public boolean delEstate(Integer estateid){
        int i = estateMapper.deleteById(estateid);
        if (i==1) return true;
        else  return false;
    }
    //更改
    public boolean updateEstate (Estate estate){
        int i = estateMapper.updateById(estate);
        if (i==1) return true;
        else  return false;
    }
    //查看所有
    public List<Estate> selectAllEstate(){
        List<Estate> list = estateMapper.selectList(null);
        return list;
    }
    //根据id查看
    public Estate selectEstate(Integer estateid){
        Estate estate = estateMapper.selectById(estateid);
        return estate;
    }
}
