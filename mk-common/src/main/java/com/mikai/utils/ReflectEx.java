package com.mikai.utils;

/**
 * Created by mk on 16/8/24.
 */
public class ReflectEx {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.mikai.utils.Demo");
        Demo demo = (Demo) cls.newInstance();
        System.out.println(demo);
    }
}

class Demo {

    private String name;

    public Demo() {
        System.out.println("创建Demo对象-----------------------");
    }

    @Override
    public String toString() {
        return "to String";
    }
}
