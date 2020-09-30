package cn.cdw.application;

import org.springframework.stereotype.Service;

/**
 * @author DW-CHEN
 * 模拟它是业务层
 */
@Service
public class UserService {
    public String testService() {
        System.out.println("service running.....");
        return "this is service Data.... TESTING SUCCESS......";
    }
}
