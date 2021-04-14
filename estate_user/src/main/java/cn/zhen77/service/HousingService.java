package cn.zhen77.service;

import cn.zhen77.mapper.HousingMapper;
import cn.zhen77.pojo.Housing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : zhen77
 * @date: 2021/4/14 - 04 - 14 - 21:39
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class HousingService {
    @Autowired
    private HousingMapper housingMapper;

    public Housing getHousingDetails(Integer building){
        Housing housing = housingMapper.getHousing(building);
        return housing;
    }


}
