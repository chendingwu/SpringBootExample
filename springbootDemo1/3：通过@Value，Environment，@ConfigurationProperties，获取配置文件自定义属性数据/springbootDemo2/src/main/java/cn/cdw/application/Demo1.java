package cn.cdw.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DW-CHEN
 * 通过@Value注解获取自定义的属性值
 */
@RestController
public class Demo1 {

    @Value("${user1.name}")
    private String user1Name;
    @Value("${user1.age}")
    private String user1Age;

    @Value(("${likes1[0]}"))
    private String like1;
    @Value(("${likes1[1]}"))
    private String like2;

    @Value("${msg1}")
    private String msg1;
    @Value("${msg2}")
    private String msg2;

    @Value("${password}")
    private String password;

    @Value("${user3.name}")
    private String user3Name;
    @Value("${user3.password}")
    private String user3Password;

    @RequestMapping("/test1")
    public String test1() {
        System.out.println("对象（map）,键值对的集合数据格式的数据："+user1Name + "  " + user1Age);
        System.out.println("数组格式的数据:"+like1 + "  "+like2);
        System.out.println("单引号的纯量格式数据:" + msg1);
        System.out.println("双引号的纯量格式数据:" + msg2);
        System.out.println("password:" + password);
        System.out.println(user3Name + "  " + user3Password);




        return "TESTING SPRINGBOOT SUCCESS.....";
    }
}
