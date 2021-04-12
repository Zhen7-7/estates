package cn.zhen77.service;

import cn.zhen77.mapper.BuildingMapper;
import cn.zhen77.pojo.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/12 - 04 - 12 - 18:16
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class BuildingService {
    @Autowired
    private  BuildingMapper buildingMapper;

    public List<Building> getAllBuilding(Integer estateid){
        List<Building> list = buildingMapper.selectByEstateid(estateid);
        return list;
    }
}
