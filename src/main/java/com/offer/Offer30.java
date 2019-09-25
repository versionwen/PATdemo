package com.offer;

public class Offer30 {
    public static int FindGreatestSumOfSubArray(int[] array){
        if(array.length==0){
            return 0;
        }
        int cur=array[0],max=array[0];
        for(int i=1;i<array.length;i++){
            if(cur>0){
                cur=cur+array[i];
            }
            else{
                cur=array[i];
            }
            if(cur>max){
                max=cur;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] wx={6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(wx));
    }
}
