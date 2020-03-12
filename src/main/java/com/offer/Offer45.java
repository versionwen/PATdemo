package com.offer;

/**
 * @author version
 * @version 1.0
 * @date 2020/3/12 22:22
 */
/*
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Offer45 {
    public double Power(double base, int exponent) {
         double ans=1;
         int flag=1;
         if(base==0){
             return 0;
         }
         if(exponent<0){
             flag=0;
             exponent=Math.abs(exponent);
         }
         while (exponent!=0){
             if(exponent%2==0){
                 base=base*base;
                 exponent=exponent/2;
             }
             ans=ans*base;
             exponent--;
         }
         if(flag==0){
             return 1/ans;
         }
         return ans;
    }

    public static void main(String[] args) {
        Offer45 wx=new Offer45();
        System.out.println(wx.Power(1.2,-2));
    }
}
