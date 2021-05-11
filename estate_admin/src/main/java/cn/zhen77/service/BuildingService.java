package cn.zhen77.service;

import cn.zhen77.mapper.BuildingMapper;
import cn.zhen77.pojo.Building;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/5/11 - 05 - 11 - 14:37
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class BuildingService {
    @Autowired
    private BuildingMapper buildingMapper;

    public boolean insert(Building building){
        int insert = buildingMapper.insert(building);
        if (insert==1){
            return true;

        }else {
            return false;
        }
    }
    public List<Building> selectAllBuildingByEstateid(Integer estateid){
        QueryWrapper<Building> qw = new QueryWrapper<Building>();
        qw.eq("estateid",estateid);
        List<Building> buildings = buildingMapper.selectList(qw);
        return buildings;
    }
}
