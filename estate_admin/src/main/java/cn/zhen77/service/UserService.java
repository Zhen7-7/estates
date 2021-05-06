package cn.zhen77.service;

import cn.zhen77.mapper.UserMapper;
import cn.zhen77.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/24 - 04 - 24 - 22:17
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class UserService  {
    @Autowired
    private UserMapper userMapper;

    //获取全部userinfo
    public List<User> getAllUserInfo() {
        List<User> users = userMapper.selectList(null);
        return users;
    }
    //删除该用户
    public boolean delUserINfo(Integer userid){
        User user = userMapper.selectById(userid);
        int i = userMapper.deleteById(userid);
        if (i==1) return true;
        else return false;

    }
    //更新用户信息
    public boolean updateUserInfo(User user){
        int i = userMapper.updateById(user);
        if (i==1) return true;
        else return false;
    }
    public User selectUserByUserid(Integer userid){
        User user = userMapper.selectById(userid);
        return user;
    }


}
