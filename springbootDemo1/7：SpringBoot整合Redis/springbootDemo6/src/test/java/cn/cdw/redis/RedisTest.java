package cn.cdw.redis;

import cn.cdw.application.SpringbootDemo6Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author DW-CHEN
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemo6Application.class)
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        redisTemplate.boundValueOps("nameKey").set("小明"); //设置值

        System.out.println(redisTemplate.boundValueOps("nameKey").get()); //获取值
    }
}
