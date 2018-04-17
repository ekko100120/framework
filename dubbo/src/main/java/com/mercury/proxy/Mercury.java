package com.mercury.proxy;

import java.lang.annotation.*;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/13-16:45
 * @Description:
 * @return:
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Mercury {
   String name() default "Mercury";
   String value() default "shanghai";
   boolean isBaby() default false;
}
