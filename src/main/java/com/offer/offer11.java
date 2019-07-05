package com.offer;

import java.util.Scanner;

/**
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 解题思路
 * 指数为负时，可以先对指数求绝对值，算出次方的结果后再取倒数
 * 当底数为0，指数为负时，会出现对0求倒数情况，要特殊处理
 * 0的0次方在数学上没有意义，因此无论输出0还是1都是可以接受的
 * 在计算次方的时候，除了简单的遍历，我们可以使用递归的思想，如下公式，来减少计算量：
 */
public class offer11 {
    public static double Power(double base,int exponent){
        int n=exponent;
        if(exponent==0){
            return 1;
        }
        else if (exponent<0){//计算指数小于0的情况
         if (base==0){
            throw new RuntimeException("底数不能为空");
        }
            n=-exponent;
        }
        double out=result(base,n);
        return exponent<0? 1/out:out;
    }
    public static double result(double base,int n){
        if (n==0)
            return 1;
        if (n==1)
            return base;
        double res=result(base,n>>1);//递归进行计算
        res*=res;
        if(n%2==1)//判断最后是不是还剩一个
            res*=base;
        return res;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double base=input.nextDouble();
        int e=input.nextInt();
        double res=Power(base,e);
        System.out.println(res);
    }
}
