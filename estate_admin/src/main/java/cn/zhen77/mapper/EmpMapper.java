package cn.zhen77.mapper;

import cn.zhen77.pojo.Emp;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/4/6 - 04 - 06 - 17:37
 * @Description: cn.zhen77.mapper
 * @version: 1.0
 */
public interface EmpMapper {

    public int insertEmp(Emp emp);
    public List<Emp> selectAll();

}
