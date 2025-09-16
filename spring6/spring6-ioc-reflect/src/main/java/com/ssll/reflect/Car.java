package com.ssll.reflect;

/**
 * ClassName: Car
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/16 13:15
 */
public class Car {

    //属性
    private String name;
    private int age;
    private String color;

    private Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Car() {
    }

    //普通方法
    private void run() {
        System.out.println("私有方法-run.....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
