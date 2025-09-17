package com.ssll.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: Bean
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/17 13:18
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Bean {

}
