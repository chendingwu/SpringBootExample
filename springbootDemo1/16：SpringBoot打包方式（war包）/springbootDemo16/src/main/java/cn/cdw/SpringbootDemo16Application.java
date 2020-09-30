package cn.cdw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author DW-CHEN
 */
@SpringBootApplication
public class SpringbootDemo16Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo16Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootDemo16Application.class); //打war包指定启动引导类
    }
}
