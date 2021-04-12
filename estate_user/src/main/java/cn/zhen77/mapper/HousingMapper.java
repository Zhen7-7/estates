package cn.zhen77.mapper;

import cn.zhen77.pojo.Housing;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface HousingMapper extends BaseMapper<Housing> {
    int deleteByPrimaryKey(Integer housingid);

    int insert(Housing record);

    int insertSelective(Housing record);

    Housing selectByPrimaryKey(Integer housingid);

    int updateByPrimaryKeySelective(Housing record);

    int updateByPrimaryKey(Housing record);
}