package cn.zhen77.mapper;

import cn.zhen77.pojo.Estate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-22
 */
public interface EstateMapper extends BaseMapper<Estate> {
    public List<Estate> selectAll();

    public Estate selectByEstateid(int estateid);

//    public List<Estate> selectEstateByAddress(String address);
}
