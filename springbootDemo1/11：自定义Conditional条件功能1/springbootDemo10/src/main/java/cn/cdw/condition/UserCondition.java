package cn.cdw.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * @author DW-CHEN
 * 条件对象
 */
public class UserCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) { //boolean决定是否创建对象
        boolean flag=true;
        try {
            Class<?> jedisClass = Class.forName("redis.clients.jedis.Jedis"); //如果能找到这个jedis的Class，说明导入了Jedis坐标依赖了
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }
}
