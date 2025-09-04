package com.ssll.iocxml;

import com.ssll.iocxml.bean.UserDao;
import com.ssll.iocxml.di.Book;
import com.ssll.iocxml.dimap.Student;
import com.ssll.iocxml.ditest.Dept;
import com.ssll.iocxml.ditest.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/3 7:12
 */
public class TestBook {


    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        // 名称获取Bean
        Book book = (Book) context.getBean("book");
        System.out.println(book);
    }

    @Test
    public void testBook1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        // 名称获取Bean
        Book book = (Book) context.getBean("book1");
        System.out.println(book);
    }


    @Test
    public void testbeanDitest1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        // 名称获取Bean
        Emp emp = (Emp) context.getBean("emp");
        emp.work();
        System.out.println(emp);
    }


    @Test
    public void testbeanDitest2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        // 名称获取Bean
        Emp emp = (Emp) context.getBean("empInner");
        emp.work();
        System.out.println(emp);
    }
    @Test
    public void testbeanDitest3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        // 名称获取Bean
        Emp emp = (Emp) context.getBean("empLink");
        emp.work();
        System.out.println(emp);
    }


    @Test
    public void testbeanArray1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");
        // 名称获取Bean
        Emp emp = (Emp) context.getBean("emp");
        emp.work();
        System.out.println(emp);
    }

    @Test
    public void testbeanList1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        // 名称获取Bean
        Dept emp = (Dept) context.getBean("dept");
        emp.info();
        System.out.println(emp);
    }

    @Test
    public void testbeanMap1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        // 名称获取Bean
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }


    @Test
    public void testbeanp1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dieref.xml");
        // 名称获取Bean
        Student student = (Student) context.getBean("studentp");
        System.out.println(student);
    }


}
