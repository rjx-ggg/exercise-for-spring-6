package com.ssll.spring6.resource;

import org.springframework.core.io.UrlResource;

public class UrlResourceDemo {

    public static void loadAndReadUrlResource(String path){
        // 创建一个 Resource 对象
        UrlResource url = null;
        try {
            url = new UrlResource(path);
            // 获取资源名
            System.out.println("1: " + url.getFilename());
            System.out.println(url.getURI());
            System.out.println(url.getURL());
            // 获取资源描述
            System.out.println(url.getDescription());
            //获取资源内容
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args) {
        //访问网络资源
        loadAndReadUrlResource("http://www.baidu.com");
        //访问本地资源
        loadAndReadUrlResource("file:ssll.txt");
    }
}