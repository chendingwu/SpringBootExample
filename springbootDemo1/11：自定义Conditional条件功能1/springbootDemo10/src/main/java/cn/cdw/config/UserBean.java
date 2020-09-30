package cn.cdw.config;

import cn.cdw.condition.UserCondition;
import cn.cdw.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author DW-CHEN
 * 将User对象添加到IOC容器
 */
@Configuration
public class UserBean {

    @Bean
    @Conditional(UserCondition.class) //使用@Conditional注解标明SpringBoot是否将User添加到IOC容器，由我们自定义的条件对象来控制SpringBoot的决定
    public User user() { //把User添加到Spring的IOC容器
        return new User();
    }
}
