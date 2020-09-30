package cn.cdw.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DW-CHEN
 * 获取配置文件封装到实体类的数据
 */
@RestController
public class Demo3 {
    @Autowired
    private User1 user1; //注入获取配置文件封装到实体类

    @RequestMapping("/test3")
    public String test3() {
        System.out.println(user1.getName() + "   " + user1.getAge());
        return "TESTING SPRINGBOOT SUCCESS.....";
    }
}
