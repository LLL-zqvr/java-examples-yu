package com.homework05;

public class BubblesSort {
    public static void main(String[] args){
        int []arr = {44,67,34,12,89};
        System.out.println("原数组为：");
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = 0;i <= arr.length - 1;i++){
            for (int j = 0;j < arr.length - 1;j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("\n" + "冒泡排序后的数组为：");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
