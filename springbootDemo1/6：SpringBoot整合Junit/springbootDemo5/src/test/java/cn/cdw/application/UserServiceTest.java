package cn.cdw.application;

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
@SpringBootTest   //这个测试类对应和启动引导类在一样的包名下，不需要添加启动引导类了参数了
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        System.out.println(userService.testService());
    }
}
