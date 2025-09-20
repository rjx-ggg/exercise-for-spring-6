package com.ssll.spring6.aop.annotationaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestAop
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/21 0:07
 */
public class TestAop {

    @Test
    public void testAop() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(1, 2);
    }

    @Test
    public void testAop2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.div(1, 0);
    }



}
