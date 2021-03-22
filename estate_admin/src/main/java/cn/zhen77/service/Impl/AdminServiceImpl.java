package cn.zhen77.service.Impl;

import cn.zhen77.mapper.AdminMapper;
import cn.zhen77.pojoi.Admin;
import cn.zhen77.service.AdminService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/22 - 03 - 22 - 23:01
 * @Description: cn.zhen77.service.Impl
 * @version: 1.0
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin getAdmin(String name) {
        QueryWrapper<Admin> adminQueryWrapper = new QueryWrapper<>();
        adminQueryWrapper.eq("name",name);
        return adminMapper.selectOne(adminQueryWrapper);
    }
}
