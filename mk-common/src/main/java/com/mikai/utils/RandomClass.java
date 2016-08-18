package com.mikai.utils;

import java.util.Random;

/**
 * Created by mk on 16/8/18.
 */
public class RandomClass {

    public static void main(String[] args) {
        int temp[] = new int[7];
        ch(temp);
        java.util.Arrays.sort(temp);
        print(temp);
    }

    public static void print(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x]+",");
        }
    }

    public static void ch(int temp[]) {
        Random random = new Random();
        int foot = 0;
        while (foot < 7) {
            int num = random.nextInt(37);
            if (num != 0) {
                if (!isRepeat(temp, num)) {
                    temp[foot++] = num;
                }
            }

        }
    }

    //不能重复,不大于32,得到七个数
    public static boolean isRepeat(int temp[], int num) {
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == num) {
                return true;
            }
        }
        return false;
    }


}
