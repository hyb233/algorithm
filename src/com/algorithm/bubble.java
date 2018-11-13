package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/******
 *author:hyb
 *date:2018/11/13  10:35
 *description:冒泡排序
 */
public class bubble {
    public static void main(String[] args) {
        int i,n,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入共有多少数：");
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("请输入随机数：");
            a[i] = sc.nextInt();//把要排序的数放进数组
        }
        //冒泡核心
        for (j = 0; j < n-1; j++) {
            for (k = 0; k < j; k++) {
                if(a[k]>a[k+1]){
                    int temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
