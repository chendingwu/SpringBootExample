package cn.cdw;

import cn.cdw.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author DW-CHEN
 * Conditional条件功能
 */
@SpringBootApplication
public class SpringbootDemo11Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootDemo11Application.class, args);
        User user = (User) run.getBean("user");
        System.out.println(user);
    }
}
