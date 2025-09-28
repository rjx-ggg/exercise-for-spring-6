package com.ssll.spring.javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ClassName: ResourceI18n
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/26 13:36
 */
public class ResourceI18n {
    public static void main(String[] args) {

        ResourceBundle message = ResourceBundle.getBundle("message",Locale.CHINA);
        System.out.println(message.getString("name"));

        ResourceBundle message1 = ResourceBundle.getBundle("message",new Locale("en","BG"));
        System.out.println(message1.getString("name"));

    }
}
