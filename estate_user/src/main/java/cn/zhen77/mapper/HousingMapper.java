package cn.zhen77.mapper;

import cn.zhen77.pojo.Housing;

public interface HousingMapper {
    int deleteByPrimaryKey(Integer housingid);

    int insert(Housing record);

    int insertSelective(Housing record);

    Housing selectByPrimaryKey(Integer housingid);

    int updateByPrimaryKeySelective(Housing record);

    int updateByPrimaryKey(Housing record);
}