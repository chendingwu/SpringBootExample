package cn.cdw.condition;

import cn.cdw.annotation.ConditionalAnnotation;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;


/**
 * @author DW-CHEN
 * 条件对象
 */
public class UserCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) { //boolean决定是否创建对象
        boolean flag=true;
        Map<String, Object> map = annotatedTypeMetadata.getAnnotationAttributes(ConditionalAnnotation.class.getName()); //获取我们自定义注解的属性数据
        String[] value = (String[]) map.get("value"); //获取我们自定义注解根据属性名获取值数据

        for (String cls : value) { //遍历获取到数组中的每个字节码文件，看是否能找到，如果找到了说明已经导入了该依赖坐标
            try {
                Class<?> aClass = Class.forName(cls);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                flag=false;
            }
        }
        return flag;
    }
}
