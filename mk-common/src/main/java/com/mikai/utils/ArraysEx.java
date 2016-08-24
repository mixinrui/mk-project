package com.mikai.utils;

import java.util.Arrays;

/**
 * Created by mk on 16/8/24.
 */
public class ArraysEx {

    public static void main(String[] args) {

        int dataA[] = new int[]{1, 2, 3};
        int dataB[] = new int[]{1, 2, 3};
        int dataC[] = new int[]{2, 1, 3};
        System.out.println(Arrays.equals(dataA, dataB));
        System.out.println(Arrays.equals(dataA, dataC));
        java.util.Arrays.sort(dataC);
        System.out.println(Arrays.equals(dataA, dataC));    //数组比较首先要排序

        int data[] = new int[]{1, 4, 64, 24, 13, 111};
        java.util.Arrays.sort(data);
        System.out.println(Arrays.binarySearch(data, 24));  //排序之后,二分查找,数字24在数组中序号是几;

        int dataD[] = new int[]{1, 2, 3};
        Arrays.fill(dataD, 10);
        System.out.println(Arrays.toString(dataD));


        //数组对象排序
        Person person[] = new Person[]{new Person("小王", 10), new Person("小李", 30), new Person("小张", 20)};
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));

    }
}

//对象排序必须实现Comparable接口,我们常用的类,如String Integer Date 等都实现了 Comparable接口, 重写 接口的 CompareTo方法;
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名:" + this.name + ", 年龄:" + this.age + "\n";
    }

    @Override
    public int compareTo(Person o) {
//        if (this.age > o.age) {
//            return 1;
//        } else if (this.age < o.age) {
//            return -1;
//        } else {
//            return 0;
//        }


//      return this.age - o.age;    //简写的排序方式
        return o.age - this.age;
    }
}
