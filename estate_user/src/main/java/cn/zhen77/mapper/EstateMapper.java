package cn.zhen77.mapper;

import cn.zhen77.pojo.Estate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


public interface EstateMapper extends BaseMapper<Estate> {
    int deleteByPrimaryKey(Integer estateid);

    int insert(Estate record);

    int insertSelective(Estate record);

    Estate selectByPrimaryKey(Integer estateid);

    int updateByPrimaryKeySelective(Estate record);

    int updateByPrimaryKey(Estate record);

    public List<Estate> selectAll();

    public Estate selectByEstateid(int estateid);

}