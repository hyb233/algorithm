package com.algorithm;

import java.util.Scanner;

/******
 *author:hyb
 *date:2018/11/8  11:14
 *description:简化版桶排序
 */
public class bucket {
    public static void main(String[] args) {
        int book[] = new int[1001];//创建了1001个桶,意味着要排序的数在0~1000以内，不然就数组越界了
        int i,j,t,n;
        for (i = 0; i <1000; i++) {
            book[i] = 0;//每个桶都是0个旗子
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入共有多少数：");//输入一个数n，表示接下来共有n个旗子
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("请输入随机数：");
            t = sc.nextInt();//把要排序的每一个数读到变量t里面
            book[t]++;//对编号为t的桶放一个旗子
        }
        for(i = 0;i<=1000;i++){//依次从编号0开始到1000判断桶里面有没有旗子
            for (j = 1; j <=book[i]; j++) {
                System.out.print(i+"   "); //有出现旗子打印桶的编号，出现几次打印几次。从而实现从小到大排序
            }
        }
    }

}
