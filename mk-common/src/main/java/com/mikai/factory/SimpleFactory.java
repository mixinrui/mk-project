package com.mikai.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by mk on 16/8/24.
 *
 * 简单工厂写法
 * 反射工厂写法--默认是调用类的无参构造函数
 * 如果该类有有参构造方法,那么如何使用反射呢,需要通过反射获取该类的构造方法,然后创建对象
 */
interface Fruit {
    public void eat();
}

class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}

class Orange implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃橘子");
    }
}

class YouPara implements Fruit {

    private String name;
    private int age;

    public YouPara(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("有参构造");
    }

    @Override
    public String toString() {
        return "姓名:"+name+",年龄:"+age;
    }
}

class WuPara{
    private String name;
    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Factory {
    public static Fruit getInstance(String className) {
        if ("apple".equalsIgnoreCase(className)) {
            return new Apple();
        }
        if ("orange".equalsIgnoreCase(className)) {
            return new Orange();
        }
        return null;
    }
}

class ReflectFactory {
    public static Fruit getInstance(String className) {
        try {
            return (Fruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class SimpleFactory {
    public static void main(String[] args) {

        Fruit fruit = Factory.getInstance("orange");
        fruit.eat();

        ReflectFactory.getInstance("com.mikai.factory.Apple").eat();
        ReflectFactory.getInstance("com.mikai.factory.Orange").eat();

        try {
            Class<?> cls = Class.forName("com.mikai.factory.YouPara");
            Constructor constructor = cls.getConstructor(String.class,int.class);
            Fruit fruit1 = (Fruit) constructor.newInstance("ccc",100);
            System.out.println(fruit1);


            Class<?> clsWu = Class.forName("com.mikai.factory.WuPara");
            Object obj = clsWu.newInstance();
            Method setMethod = clsWu.getMethod("setName",String.class);
            Method getMethod = clsWu.getMethod("getName");
            setMethod.invoke(obj,"张三");
            System.out.println(getMethod.invoke(obj));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}