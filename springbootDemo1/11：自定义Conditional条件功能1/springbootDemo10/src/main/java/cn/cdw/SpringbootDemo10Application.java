package cn.cdw;

import cn.cdw.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author DW-CHEN
 * 分析SpringBoot自动配置（Condition)
 * Conditional条件功能
 */
@SpringBootApplication
public class SpringbootDemo10Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootDemo10Application.class, args); //启动SpringBoot的应用，返回Spring的IOC容器

        User user = (User)run.getBean("user"); //测试如果有jedis坐标依赖SpringBoot则将User对象添加到IOC容器，反之则不添加到IOC容器
        System.out.println(user);
    }
}
