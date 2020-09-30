package cn.cdw.annotation;

import cn.cdw.condition.UserCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author DW-CHEN
 * 自定义注解使用@Conditional注解来指定条件对象
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(UserCondition.class) //使用@Conditional注解标明谁使用我这个自定义注解设置的字节码文件的值，使用@Conditional注解来指定条件对象，然后让条件对象来获取这个值进行对条件对象的判断
public @interface ConditionalAnnotation {
    String[] value();
}
