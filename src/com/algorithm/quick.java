package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/******
 *author:hyb
 *date:2018/11/14  10:33
 *description: 快速排序
 */
public class quick {
    private static int a[] = new int[101];
    private static void quickSort(int left,int right){
        int i,j,t,temp;
        if(left>right){
            return;
        }
        temp = a[left];
        i = left;
        j = right;
        while (i!=j){
            while (a[j]>= temp && i<j) {
                j--;
            }
            while (a[i]<=temp && i<j) {
                i++;
            }
            if(i<j) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[left] = a[i];
        a[i] = temp;
        quickSort(left,i-1);
        quickSort(i+1,right);
    }

    public static void main(String[] args) {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入共有多少数：");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("请输入随机数：");
            a[i] = sc.nextInt();//把要排序的数放进数组
        }
        quickSort(0,n);
        System.out.println(Arrays.toString(a));
    }
}
