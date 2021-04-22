package cn.zhen77.service;

import cn.zhen77.mapper.ReportMapper;
import cn.zhen77.pojo.Report;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Zhen77
 * @since 2021-04-21
 */
@Service
public class ReportService {
    @Autowired
    ReportMapper reportMapper;
    public Report getReport(Integer userid){
        QueryWrapper<Report> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userid",userid);
        return reportMapper.selectOne(queryWrapper);
    }
    public Integer insert(Report Report){
        //定义查询包装类
        int insert = reportMapper.insert(Report);
        return insert;
    }

}
