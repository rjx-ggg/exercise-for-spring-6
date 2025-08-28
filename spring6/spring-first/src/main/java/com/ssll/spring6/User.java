package com.ssll.spring6;

/**
 * ClassName: User
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/8/27 22:30
 */
public class User {

    public User () {
        System.out.println("User无参构造方法执行...");
    }

    public void add() {
        System.out.println("add...");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }


}
