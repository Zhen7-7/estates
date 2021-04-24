package cn.zhen77.mapper;

import cn.zhen77.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-24
 */
public interface UserMapper extends BaseMapper<User> {
    public List<User> selectAllUserinfo();
}
