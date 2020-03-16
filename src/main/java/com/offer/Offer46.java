package com.offer;

/**
 * @author version
 * @version 1.0
 * @date 2020/3/16 20:33
 */
/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Offer46 {
    public void reOrderArray(int [] array) {
        int[] temp=new int[1000];
        int[] res=new int[1000];
        int wx=0;
        int k=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==0){
                temp[k++]=array[i];//偶数
                array[i]=0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                res[wx]=array[i];//奇数
                wx++;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            res[wx+i]=temp[i];
        }
        for (int i = 0; i <array.length ; i++) {
            array[i]=res[i];
        }
    }

    public static void main(String[] args) {
         int[] wx={1,2,3,4,5,6,7,8,9};
         Offer46 wx1=new Offer46();
         wx1.reOrderArray(wx);
        for (int i = 0; i <wx.length ; i++) {
            System.out.println(wx[i]);
        }
    }
}
