package cn.zhen77.service;

import cn.zhen77.mapper.AdminMapper;
import cn.zhen77.pojo.Admin;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/20 - 04 - 20 - 21:44
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Admin getAdminInfo(String name){
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("adminname",name);
        return adminMapper.selectOne(queryWrapper);
    }
    public List<Admin> getAllAdmin(){
        List<Admin> admins = adminMapper.selectList(null);
        return admins;
    }

}
