package cn.cdw.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DE-CHEN
 * 通过注入Environment 使用它的根据键获取对应的值
 */
@RestController
public class Demo2 {

    @Autowired
    private Environment environment;

    @RequestMapping("/test2")
    public String test2() {
        System.out.println("对象（map）,键值对的集合数据格式的数据："+environment.getProperty("user1.name") + "  " + environment.getProperty("user1.age"));
        System.out.println("数组格式的数据:"+environment.getProperty("likes1[0]") + "  "+environment.getProperty("likes1[1]"));
        System.out.println("单引号的纯量格式数据:" + environment.getProperty("msg1"));
        System.out.println("双引号的纯量格式数据:" + environment.getProperty("msg2"));
        System.out.println("password:" + environment.getProperty("password"));
        System.out.println(environment.getProperty("user3.name") + "  " + environment.getProperty("user3.password"));

        return "TESTING SPRINGBOOT SUCCESS.....";
    }
}
