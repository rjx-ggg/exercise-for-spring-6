package com.ssll.spring6.resourceloader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class Demo1 {

    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext();
//        通过ApplicationContext访问资源
//        ApplicationContext实例获取Resource实例时，
//        默认采用与ApplicationContext相同的资源访问策略
        Resource res = ctx.getResource("ssll.txt");
        System.out.println(res.getFilename());
        System.out.println(res.getDescription());
        InputStream in = res.getInputStream();
        byte[] b = new byte[1024];
        while(in.read(b)!=-1) {
            System.out.println(new String(b));
        }
    }
}