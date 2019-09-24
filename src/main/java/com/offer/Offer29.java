package com.offer;

import java.util.ArrayList;
import java.util.Arrays;

public class Offer29 {
    public static ArrayList<Integer>GetLeastNumbers(int[]input,int k){
        ArrayList<Integer>res=new ArrayList<>();
        if(input==null||k==0||k>input.length){
            return res;
        }
        Arrays.sort(input);//排序时间复杂度为O（nlogn）
        for(int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] input={4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers(input,4));
    }
}
