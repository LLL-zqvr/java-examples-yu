package com.homework05;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args){
        double a = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入重复次数：");
        int repeat = sc.nextInt();
        double sum = 0;
        double ans = 0;
        System.out.println("则表达式为：");
        for(int i = 0;i <repeat;i++){
            sum += (a * Math.pow(10, i));
            if(i == 0){
                System.out.print(sum + " +");
            } else if (i == repeat - 1) {
                System.out.print(" " + sum);
            }else{
                System.out.print(" " + sum + " +");
            }
            ans += sum;
        }
        System.out.println(" = " + ans);
    }
}
