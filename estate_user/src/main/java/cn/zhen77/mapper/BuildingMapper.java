package cn.zhen77.mapper;

import cn.zhen77.pojo.Building;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface BuildingMapper extends BaseMapper<Building> {

    int deleteByPrimaryKey(Integer buildingid);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Integer buildingid);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);

    List<Building> selectByEstateid (Integer estateid);
}