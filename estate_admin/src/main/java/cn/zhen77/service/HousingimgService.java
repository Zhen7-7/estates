package cn.zhen77.service;

import cn.zhen77.mapper.HousingimgMapper;
import cn.zhen77.pojo.Housingimg;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : zhen77
 * @date: 2021/5/11 - 05 - 11 - 14:52
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class HousingimgService {
    @Autowired
    private HousingimgMapper housingimgMapper;
    public Housingimg getimg(Integer housingimgid){
        QueryWrapper<Housingimg> queryWrapper = new QueryWrapper<>();
        Housingimg housingimg = housingimgMapper.selectById(housingimgid);
        return housingimg;
    }
    public Integer insertimg(Housingimg housingimg){
        int insert = housingimgMapper.insert(housingimg);
        return insert;
    }
    public Integer getHousingid(String housingimg1, String housingimg2, String housingimg3, String housingimg4, String housingimg5) {
        QueryWrapper<Housingimg> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("housingimg1",housingimg1).eq("housingimg2",housingimg2).eq("housingimg3",housingimg3).eq("housingimg4",housingimg4).eq("housingimg5",housingimg5);
        Housingimg housingimg = housingimgMapper.selectOne(queryWrapper);
        Integer id = housingimg.getHousingimgid();
        return id;
    }

}
