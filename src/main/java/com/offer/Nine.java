package com.offer;

/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 *
 * 解题思路
 * 公式:
 * f(n) = n, n <= 1
 * f(n) = f(n-1) + f(n-2), n > 1
 *
 */
public class Nine {
    public static int Fibonacci(int n){
        if (n==0||n==1){
            return n;
        }
        int fn1=0;
        int fn2=1;
        for (int i=2;i<=n;i++){
            fn2+=fn1;
            fn1=fn2-fn1;
        }
        return fn2;
    }

    public static void main(String[] args) {
        int fibonacci = Fibonacci(160);
        System.out.println(fibonacci);
    }
}
