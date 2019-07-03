package com.other;

import java.util.Scanner;

public class POJ1852 {
    public static int max(int a,int b){
        if (a>b){
            return a;
        }
        else
            return b;
    }
    public static int min(int a,int b){
        if (a>b){
            return b;
        }
        else {
            return a;
        }
    }

    public static void main(String[] args) {
        int L,n,minT=0,maxT=0;
        int x[]=new int[1000000];
        Scanner input=new Scanner(System.in);
        String length=input.nextLine();
        String num=input.nextLine();
        String[] split1 = length.split("=");
        String[] split = num.split("=");
        L=Integer.parseInt(split1[1]);
        n=Integer.parseInt(split[1]);
        for (int i=0;i<n;i++){
             minT=max(minT,min(x[i],L-x[i]));
        }

    }
}
