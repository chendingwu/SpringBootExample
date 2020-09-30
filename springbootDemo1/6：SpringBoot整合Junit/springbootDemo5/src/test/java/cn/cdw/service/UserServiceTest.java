package cn.cdw.service;

import cn.cdw.application.SpringbootDemo5Application;
import cn.cdw.application.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author DW-CHEN
 * junit测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemo5Application.class)   //不在和启动引导类同样的报名，需添加启动引导类参数
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void test() {
        System.out.println(userService.testService());
    }
}
