package com.ssll.spring6.aop.annotationaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName: LogAspect
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/20 22:19
 */

@Aspect // 声明这是一个切面类
@Component
public class LogAspect {

    // 设置切入点和通知类型
    // 通知类型：前置（@Before）、返回（@AfterReturning）、异常（@AfterThrowing）、后置（@After）、环绕（@Around）
    // 切入点表达式：execution(访问权限修饰符 返回值类型 方法全路径(参数列表))
    // execution(public int com.ssll.spring6.aop.annotationaop.CalculatorImpl.add(int,int))
    // execution(public int com.ssll.spring6.aop.annotationaop.CalculatorImpl.*(..))


    /**
     * 前置通知
     */
    @Before(value = "execution(public int com.ssll.spring6.aop.annotationaop.CalculatorImpl.*(..))")
    public void beforeLog(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名："+methodName+"，参数："+args);
    }


    // 后置通知
    @After(value = "execution(public int com.ssll.spring6.aop.annotationaop.CalculatorImpl.*(..))")
    public void afterReturningLog(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->后置通知，方法名："+methodName+"，参数："+args);
    }

    // 返回通知
    @AfterReturning(value = "execution(public int com.ssll.spring6.aop.annotationaop.CalculatorImpl.*(..))", returning = "result")
    public void afterReturningLog(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->返回通知，方法名："+methodName+"，参数："+args+"，返回值："+result);
    }

    // 异常通知
    @AfterThrowing(value = "execution(public int com.ssll.spring6.aop.annotationaop.CalculatorImpl.*(..))", throwing = "e")
    public void afterThrowingLog(JoinPoint joinPoint, Throwable e) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->异常通知，方法名："+methodName+"，参数："+args+"，异常："+e);
    }

    // 环绕通知
    @Around(value = "execution(public int com.ssll.spring6.aop.annotationaop.CalculatorImpl.*(..))")
    public Object aroundLog(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        Object result = null;
        try {
            // 执行目标方法前
            System.out.println("Logger-->环绕通知: 执行目标方法前，方法名："+methodName+"，参数："+args);
            // 执行目标方法
            result = joinPoint.proceed();
            // 执行目标方法后
            System.out.println("Logger-->环绕通知: 执行目标方法后，方法名："+methodName+"，参数："+args +"，返回值："+result);
            // 返回通知
        } catch (Throwable ex) {
            // 异常通知
            System.out.println("Logger-->环绕通知: 执行目标方法出现异常出现，方法名："+methodName+"，参数："+args +"，返回值："+result);
            ex.printStackTrace();
        } finally {
            // 后置通知
            System.out.println("Logger-->环绕通知: 执行目标方法后最终，方法名："+methodName+"，参数："+args +"，返回值："+result);
        }
        return result;
    }



}
