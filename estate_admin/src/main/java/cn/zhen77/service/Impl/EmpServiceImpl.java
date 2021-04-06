package cn.zhen77.service.Impl;

import cn.zhen77.mapper.EmpMapper;
import cn.zhen77.pojo.Emp;
import cn.zhen77.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @author : zhen77
 * @date: 2021/4/6 - 04 - 06 - 17:41
 * @Description: cn.zhen77.service.Impl
 * @version: 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public int insertEmp(Emp emp, @RequestParam("file") MultipartFile multipartFile) {

        try {
            String newname=null;
            String oldname= multipartFile.getOriginalFilename();
            newname= UUID.randomUUID().toString()+ oldname.substring(oldname.lastIndexOf("."));
            //创建存放路径的文件
            File upload = new File("C:\\MyData\\estates\\real_estate\\estate_admin\\src\\main\\resources\\img/");
            if(!upload.exists()){
                upload.mkdirs();
            }

            //将图片存放到指定的文件里面
            File  resultpath=  new File(upload+newname);
            multipartFile.transferTo(resultpath);
            String finalpath=resultpath.toString();
            emp.setPhoto(finalpath);
            emp.setId(2);
            emp.setName("傻逼孙跃杰");



            //把Emp保存到数据库中
            return empMapper.insertEmp(emp);

        } catch (IOException e) {
            e.printStackTrace();
        }


        return 0;




    }

    @Override
    public List<Emp> findAllEmp() {
        return null;
    }
}
