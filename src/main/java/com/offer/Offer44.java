package com.offer;

/**
 * @author version
 * @version 1.0
 * @date 2020/3/12 21:50
 */

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Offer44 {
    public int NumberOf1(int n) {
        int temp=0;
         while (n!=0){
             n=n&(n-1);
             temp++;
         }
         return temp;
    }

    public static void main(String[] args) {
        Offer44 wx=new Offer44();
        System.out.println(wx.NumberOf1(14));
    }
}
