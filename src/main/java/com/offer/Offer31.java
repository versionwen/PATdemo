package com.offer;

public class Offer31 {
    public static int NumberOfBetween1AndN_Solution(int n){
        int res=0;
        for(int i=1;i<=n;i++){
            res=res+number1(i);
        }
        return res;
    }
    public static int number1(int n){
        int res=0;
        while(n>0){
            if(n%10==1){
                res++;
            }
            n/=10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(NumberOfBetween1AndN_Solution(13));
    }
}
