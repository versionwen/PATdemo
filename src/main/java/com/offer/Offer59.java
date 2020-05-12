package com.offer;

/**
 * @author version
 * @version 1.0
 * @date 2020/5/12 22:03
 */
/*
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Offer59 {
    public int MoreThanHalfNum_Solution(int[] array){
        if(array==null||array.length==0)
            return 0;
        int preValue=array[0];
        int count=1;
        for(int i=1;i<array.length;i++){
            if(array[i]==preValue){
                count++;
            }
            else {
                count--;
                if (count==0){
                    preValue=array[i];
                    count=1;
                }
            }
        }
        int num=0;
        for (int i=0;i<array.length;i++){
            if(array[i]==preValue){
                num++;
            }
        }
        return (num>array.length/2)?preValue:0;
    }

    public static void main(String[] args) {
        int[] res={1,2,3,2,2,2,5,4,2};
        Offer59 out=new Offer59();
        System.out.println(out.MoreThanHalfNum_Solution(res));
    }
}
