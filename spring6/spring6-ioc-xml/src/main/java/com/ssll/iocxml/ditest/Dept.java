package com.ssll.iocxml.ditest;

import java.util.List;

/**
 * ClassName: Dept
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/3 21:31
 */
public class Dept {
    private String dname;

    private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }


    public void setDname(String dname) {
        this.dname = dname;
    }

    public void info() {
        System.out.println("部门名称是：" + dname);
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                ", emps=" + emps +
                '}';
    }
}
