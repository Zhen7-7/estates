package cn.zhen77;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : zhen77
 * @date: 2021/4/20 - 04 - 20 - 21:25
 * @Description: cn.zhen77
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("cn.zhen77.mapper")
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}
