package cn.cdw.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author DW-CHEN
 * 启动引导类
 * spring boot 工程都有一个启动引导类，这个是工程的入口类
 * 启动引导类必须要加上一个注解：@SpringBootApplication
 */
@SpringBootApplication
public class SpringbootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class);
    }
}
