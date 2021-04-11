package cn.zhen77.mapper;

import cn.zhen77.pojo.Building;

public interface BuildingMapper {
    int deleteByPrimaryKey(Integer buildingid);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Integer buildingid);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);
}