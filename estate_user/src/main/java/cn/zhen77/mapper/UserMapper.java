package cn.zhen77.mapper;

import cn.zhen77.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/10 - 04 - 10 - 10:46
 * @Description: cn.zhen77.mapper
 * @version: 1.0
 */
public interface UserMapper extends BaseMapper<User> {
    public User selectUserByUsername(String name);
}
