package com.mikai.utils;

/**
 * Created by mk on 16/8/18.
 */
public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.round(100.7898));  //round()四舍五入方法,缺点只能保留整数位。如果想保留小数位,需要通过pow()方法配合
        System.out.println(Math.round(15.50));
        System.out.println(Math.round(-15.50));
        System.out.println(Math.round(-15.51));
        System.out.println(Math.pow(10.0,5));
        System.out.println(MyMath.round(100.7898,2));
    }
}
class MyMath{
    public static double round (double num,int scale){
        return Math.round(num * Math.pow(10.0,scale))/Math.pow(10.0,scale);
    }
}