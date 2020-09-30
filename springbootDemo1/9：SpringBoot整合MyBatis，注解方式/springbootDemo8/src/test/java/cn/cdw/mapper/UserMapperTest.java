package cn.cdw.mapper;

import cn.cdw.SpringbootDemo8Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author DW-CHEN
 * 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemo8Application.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void test1() {
        System.out.println(userMapper.selectAll());
    }
}
