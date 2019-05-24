package com.offer;

import java.util.Scanner;

public class ArryMin {
    public static boolean isArryMin(int [][]arry,int target){
        if(arry.length<1){
            return false;
        }
        int i=0;
        int m=arry.length-1;//行值
        int n=arry[0].length-1;//列值
        int j=n;
        while ((i<=m)&&(j>=0)){
            if(arry[i][j]<target){
                i++;
            }
            else if (arry[i][j]>target){
                j--;
            }
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int rows,cols;
        int [][]arry=new int[1000][];
        Scanner input=new Scanner(System.in);
        rows=input.nextInt();
        cols=input.nextInt();
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arry[i][j]=input.nextInt();
            }
        }
    }
}
