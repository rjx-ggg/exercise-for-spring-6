package com.ssll.spring6.aop.example;

/**
 * ClassName: TestCal
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/18 23:44
 */
public class TestCal {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new CalculatorLogImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.div(1,3);
    }
}
