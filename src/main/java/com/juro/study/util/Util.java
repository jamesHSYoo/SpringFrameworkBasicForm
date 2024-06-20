package com.juro.study.util;

public class Util {

    public static double getLogReturn(double price, double basePrice){
        return Math.log(price/basePrice);
    }

    public static void changeNegative(int val){
        if(val > 0)
            val = (-1)*val;
    }


}
