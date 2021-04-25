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
 * @date: 2021/4/10 - 04 - 10 - 10:41
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class UserService  {
    @Autowired
    private UserMapper userMapper;

    //根据用户名返回用户信息
    public User selectUser(String name) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",name);
        User user = userMapper.selectOne(queryWrapper);
        return user;
    }


    //插入User
    public Integer insertUser(User user){
        //定义查询包装类
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username",user.getUsername());
        User findResult = userMapper.selectOne(queryWrapper);
        int result=0;
        if(findResult!=null){
            return result;
        }else{
            result = userMapper.insert(user);
            return result;
        }
    }

}
