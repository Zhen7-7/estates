package cn.zhen77.service;

import cn.zhen77.pojo.Emp;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/6 - 04 - 06 - 17:39
 * @Description: cn.zhen77.service
 * @version: 1.0
 */

public interface EmpService {
    public int insertEmp(Emp emp, MultipartFile file);
    public List<Emp> findAllEmp();
}
