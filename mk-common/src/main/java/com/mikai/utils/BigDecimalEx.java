package com.mikai.utils;

import java.awt.geom.Ellipse2D;
import java.math.BigDecimal;

/**
 * Created by mk on 16/8/18.
 */


public class BigDecimalEx {


    public static double round (double num, int scale){
        return new BigDecimal(num).divide(new BigDecimal(1),scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    public static void main(String[] args) {
        System.out.println(Double.MAX_VALUE * Double.MAX_VALUE);
        BigDecimal bigDecimal = new BigDecimal(Double.MAX_VALUE);
        System.out.println(round(-15.4353454,2));
    }
}
