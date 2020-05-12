package com.offer;

/**
 * @author version
 * @version 1.0
 * @date 2020/5/9 22:03
 */
/*
求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Offer57 {
    public int NumberOf1Between1AndN_Solution(int n) {
                int sum=n;
                boolean b=(n>0)&&(sum+=NumberOf1Between1AndN_Solution(n-1))>0;
                return sum;
    }

    public static void main(String[] args) {
        Offer57 result=new Offer57();
        System.out.println(result.NumberOf1Between1AndN_Solution(4));
    }
}
