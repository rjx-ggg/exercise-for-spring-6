package com.ssll.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName: CatTest
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/16 13:22
 */
public class CarTest {

    /**
     * 获取Class对象的多种方式
     */
    @Test
    public void testCar() throws Exception {
        //1 类名.class
        Class<Car> clazz1 = Car.class;

        //2 对象.getClass()
        Car car = new Car();
        Class<? extends Car> clazz2 = car.getClass();

        //3 Class.forName("全类名")
        Class<?> clazz3 = Class.forName("com.ssll.reflect.Car");

        // 实例化
        Car car1 = clazz2.getDeclaredConstructor().newInstance();
        System.out.println(car1);
    }


    /**
     * 获取类的构造方法
     * @throws Exception
     */
    @Test
    public void testCar2() throws Exception {
        Class<Car> clazz = Car.class;
        // 获取所有公共的构造方法
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // 获取所有构造方法(包括私有)
        System.out.println("=====================");
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        // 获取公共的有参构造器创建实例对象
//        Constructor<Car> constructor = clazz.getConstructor(String.class, int.class, String.class);
//        Car car = constructor.newInstance("奔驰", 100, "黑色");
//        System.out.println(car);

        // 获取私有构造器创建实例对象
        Constructor<Car> declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        declaredConstructor.setAccessible(true);
        Car car1 = declaredConstructor.newInstance("宝马", 200, "白色");
        System.out.println(car1);
    }

    /**
     * 获取类的成员变量，并进行赋值
     */
    @Test
    public void testCar3() throws Exception {
        Class<Car> clazz = Car.class;
        // 获取所有公共的成员变量
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        // 获取所有成员变量(包括私有)
        System.out.println("=====================");
        Car car = new Car();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("name")){
                declaredField.setAccessible(true);
                declaredField.set(car,"奔驰");
            }
            System.out.println(declaredField.getName());
        }
        System.out.println(car);
    }


    /**
     * 获取类的方法
     */
    @Test
    public void testCar4() throws Exception {
        Class<Car> clazz = Car.class;
        // 获取所有公共的方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        // 获取所有方法(包括私有)
        Car car = new Car();
        System.out.println("=====================");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            declaredMethod.setAccessible(true);
            if (declaredMethod.getName().equals("run")){
                declaredMethod.invoke(car);
            }
            System.out.println(declaredMethod.getName());
        }
    }





}
