package com.ssll.spring6.resourceloader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class Demo2 {

    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new FileSystemXmlApplicationContext();
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