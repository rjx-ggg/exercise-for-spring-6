package com.ssll.iocxml.ditest;

import java.util.Arrays;

/**
 * ClassName: Emp
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/3 21:31
 */
public class Emp {
    private String ename;
    private String age;
    private Dept dept;

    private String[] loves;

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void work() {
        System.out.println(ename + "Emp.work()");
        dept.info();
    }


//    @Override
//    public String toString() {
//        return "Emp{" +
//                "ename='" + ename + '\'' +
//                ", age='" + age + '\'' +
//                ", dept=" + dept +
//                ", loves=" + Arrays.toString(loves) +
//                '}';
//    }
}
