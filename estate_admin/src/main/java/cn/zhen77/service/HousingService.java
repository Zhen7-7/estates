package cn.zhen77.service;

import cn.zhen77.mapper.HousingMapper;
import cn.zhen77.pojo.Housing;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/5/11 - 05 - 11 - 15:01
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class HousingService {
    @Autowired
    private HousingMapper housingMapper;
    //获取一栋楼的housing
    public List<Housing> getHousingsByBuildingid(Integer buildingid){
        QueryWrapper<Housing> qw = new QueryWrapper<>();
        qw.eq("buildingid" ,buildingid);
        List<Housing> housings = housingMapper.selectList(qw);
        return housings;
    }
    //获取某一间房基本信息
    public Housing getHousingByHousingid(Integer housingid){
        Housing housing = housingMapper.selectById(housingid);
        return housing;
    }
    //插入房间
    public Integer insertHouising(Housing housing){
        int insert = housingMapper.insert(housing);
        return insert;
    }
}
