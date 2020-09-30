package cn.cdw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author DW-CHEN
 * 分析SpringBoot自动配置Condition
 */
@SpringBootApplication
public class SpringbootDemo9Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootDemo9Application.class, args); //启动SpringBoot的应用，返回Spring的IOC容器

        Object redisTemplate = run.getBean("redisTemplate"); //当我们添加redis依赖坐标后，SpringBoot会自动将Redis添加到IOC容器
        System.out.println(redisTemplate);
    }
}
