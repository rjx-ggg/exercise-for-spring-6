package com.ssll.iocxml.dimap;

import java.util.List;
import java.util.Map;

/**
 * ClassName: Student
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/3 22:30
 */
public class Student {
    private String sname;
    private String sid;

    private Map<String, Teacher> teacherMap;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public void run() {
        System.out.println("学生姓名是：" + sname + "，学生编号是：" + sid);
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sid='" + sid + '\'' +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
