package com.ssll.iocxml.life;

/**
 * ClassName: User
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/6 21:07
 */
public class User {
    private String name;

    public User() {
        System.out.println("1.--User的无参构造方法执行了");
    }

    //初始化方法
    public void initMethod(){
        System.out.println("3.--initMethod执行了");
        this.name = "张三";
    }

    //销毁方法
    public void destroyMethod(){
        System.out.println("4.--destroyMethod执行了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2.--setName方法执行了");
        this.name = name;
    }
}
