package cn.cdw.config;

import cn.cdw.annotation.ConditionalAnnotation;
import cn.cdw.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author DW-CHEN
 * 将User对象添加到IOC容器
 * 测试 判断环境中是否有对应的字节码文件才初始化Bean
 */
@Configuration
public class UserBean {

    @Bean
   // @ConditionalAnnotation(value = "redis.clients.jedis.Jedis")  //使用我自定义的注解，这个注解了它使用了Conditional注解指定了条件对象动态获取，我们指定的字节码文件
    // @ConditionalAnnotation(value = "com.alibaba.fastjson.JSON")  //测试
    @ConditionalAnnotation(value = {"com.alibaba.fastjson.JSON","redis.clients.jedis.Jedis"})
    public User user() { //把User添加到Spring的IOC容器
        return new User();

    }
}
