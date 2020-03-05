package com.offer;

/**
 * @author version
 * @version 1.0
 * @date 2020/3/5 21:14
 */
/*
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
 */
public class Offer43 {
    public int Fibonacci(int n) {
          if(n==0){
              return 0;
          }
          if(n==1){
              return 1;
          }
            int ans=1;
            int temp1=0;
            for(int i=2;i<=n;i++){
                ans=temp1+ans;
                temp1=ans-temp1;
                }
            return ans;
    }
    public static void main(String[] args) {
        Offer43 wx=new Offer43();
        System.out.println(wx.Fibonacci(4));
    }
}
