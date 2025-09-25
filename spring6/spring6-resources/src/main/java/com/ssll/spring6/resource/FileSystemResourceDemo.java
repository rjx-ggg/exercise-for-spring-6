package com.ssll.spring6.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;

public class FileSystemResourceDemo {

    public static void loadFileResource(String path) throws Exception{
        //path: 相对路径: 根目录下文件;
        // 绝对路径: 文件全路径
        FileSystemResource resource = new FileSystemResource(path);
        // 获取文件名
        System.out.println("resource.getFileName = " + resource.getFilename());
        // 获取文件描述
        System.out.println("resource.getDescription = "+ resource.getDescription());
        //获取文件内容
        InputStream in = resource.getInputStream();
        byte[] b = new byte[1024];
        while(in.read(b)!=-1) {
            System.out.println(new String(b));
        }
    }

    public static void main(String[] args) throws Exception {
        loadFileResource("ssll.txt");
//        loadFileResource("C:\\Users\\18398\\Downloads\\【批量下载】6等\\短剧\\备用\\J-家里家外（79集）王道铁&孙艺燃\\6.mp4");
    }
}