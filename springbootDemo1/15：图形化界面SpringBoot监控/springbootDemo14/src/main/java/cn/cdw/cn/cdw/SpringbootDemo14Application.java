package cn.cdw.cn.cdw;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author DW-CHEN
 * SpringBoot监控服务端
 */
@SpringBootApplication
@EnableAdminServer
public class SpringbootDemo14Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo14Application.class, args);
    }
}
