package cn.cdw.mapper;

import cn.cdw.SpringbootDemo7Application;
import cn.cdw.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author DW-CHEN
 * 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemo7Application.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;  //如果mapper接口不使用@Repository注解，它会有红色提示，但是也不影响

    @Test
    public void test1() {
        List<User> userList = userMapper.selectAll();
        System.out.println(userList);
    }
}
