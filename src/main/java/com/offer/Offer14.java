package com.offer;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;

/**
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Offer14 {
    public static void Swap(int[] arry){
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        for(int i=0;i<arry.length;i++){
            if(arry[i]%2==0){
                odd.add(arry[i]);
            }
            else {
                even.add(arry[i]);
            }
        }
        odd.addAll(even);
        for (int i=0;i<arry.length;i++){
            arry[i]=odd.get(i);
        }
    }

    public static void main(String[] args) {
        int[] wx={1,2,3,4,5,6,7,8,9,10};
        Swap(wx);
        for(int i=0;i<wx.length;i++)
        System.out.println(wx[i]);
    }
}
