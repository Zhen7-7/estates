package cn.zhen77.mapper;

import cn.zhen77.pojo.Robhousing;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-15
 */
public interface RobhousingMapper extends BaseMapper<Robhousing> {
    public List<Robhousing> selectAll();
}
