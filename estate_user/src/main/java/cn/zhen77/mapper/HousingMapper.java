package cn.zhen77.mapper;

import cn.zhen77.pojo.Housing;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface HousingMapper extends BaseMapper<Housing> {


    Housing getHousing(Integer buildingid);
}
