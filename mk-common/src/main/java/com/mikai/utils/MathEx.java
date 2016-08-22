package com.mikai.utils;

/**
 * Created by mk on 16/8/18.
 */
public class MathEx {
    public static void main(String[] args) {

        System.out.println(Math.round(100.7898));  //round()四舍五入方法,缺点只能保留整数位。如果想保留小数位,需要通过pow()方法配合

        System.out.println(Math.round(15.50));

        System.out.println(Math.round(-15.50));

        System.out.println(Math.round(-15.51));

        System.out.println(Math.pow(10.0, 5));                     //pow方法,10的5次方;

        System.out.println(round(100.7898, 2));
    }

    public static double round(double num, int scale) {           //通过 pow , round 方法结合,进行四舍五入运算;

        return Math.round(num * Math.pow(10.0, scale)) / Math.pow(10.0, scale);

    }
}
