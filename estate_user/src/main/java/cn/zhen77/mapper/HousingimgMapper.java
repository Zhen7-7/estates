package cn.zhen77.mapper;

import cn.zhen77.pojo.Housing;
import cn.zhen77.pojo.Housingimg;

public interface HousingimgMapper {
    int deleteByPrimaryKey(Integer housingimgid);

    int insert(Housingimg record);

    int insertSelective(Housingimg record);

    Housingimg selectByPrimaryKey(Integer housingimgid);

    int updateByPrimaryKeySelective(Housingimg record);

    int updateByPrimaryKey(Housingimg record);


}