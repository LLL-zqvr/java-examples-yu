package com.example01;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        //闰年计算，在主函数调用方法，给定参数，1899，2046。
        leapYear(1899);
        leapYear(2046);
    }
    public static void leapYear(int year){
        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "不是闰年");
        }
    }
}
