package cn.zhen77.service;

import cn.zhen77.mapper.ReportMapper;
import cn.zhen77.pojo.Report;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/5/6 - 05 - 06 - 19:03
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
@Service
public class ReportService {
    @Autowired
    private ReportMapper reportMapper;

    //查看所有意见反馈
    public List<Report> getAllReport(){
        List<Report> reports = reportMapper.selectList(null);
        return reports;
    }
    //修改部分意见反馈
    public Boolean updateReport(Integer Reportid){
        Report report = reportMapper.selectById(Reportid);
        report.setIssolve(true);
        int i = reportMapper.updateById(report);
        if (i==1){
            return true;
        }else {
            return false;
        }
    }
    //查看是否采纳的
    public List<Report> notresolve(boolean issolve){
        QueryWrapper<Report> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("issolve",issolve);
        List<Report> Reports = reportMapper.selectList(queryWrapper);
        return Reports;
    }

    //删除
    public boolean deleReport(Integer Reportid){
        int i = reportMapper.deleteById(Reportid);
        if (i==1){
            return true;
        }else {
            return false;
        }

    }
}
