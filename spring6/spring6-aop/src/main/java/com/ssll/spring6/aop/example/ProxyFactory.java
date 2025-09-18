package com.ssll.spring6.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: ProxyFactory
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/18 23:22
 */
public class ProxyFactory {


    // 目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回代理对象方法
    public Object getProxy() {

        // 三个入参
        // 1. 类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        // 2. 目标对象实现的接口数组
        Class<?>[] interfaces = target.getClass().getInterfaces();
        // 3. 需要增强的方法
        InvocationHandler invocationHandler = new InvocationHandler() {
            // proxy: 代理对象
            // method: 目标方法对象
            // args: 目标方法的参数
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 前置通知
                System.out.println(method.getName() + " 方法执行前");
                // 调用目标方法
                Object result = method.invoke(target, args);
                // 后置通知
                System.out.println(method.getName() + " 方法执行后");
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }


}
