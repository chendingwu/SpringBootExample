package cn.cdw.application;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author DW-CHEN
 * 使用@ConfigurationProperties将配置文件数据封装到实体类
 */

@Component
@ConfigurationProperties(prefix = "user1")
public class User1 {
    private String name;
    private String age;

    public User1() {

    }

    public User1(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
