package com.offer;

import java.sql.SQLOutput;

/**
 * 题目描述
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 */
public class Seven {
    public static void main(String[] args) {
        int[] input={3,4,5,1,2};
        int low,high,mid;
        low=0;
        high=input.length-1;
        if(input.length==0)
            return ;
        while (low<high) {
            mid=(low+high)/2;
            if (input[mid] > input[high]) {
                low = mid + 1;
            }
            else if(input[mid]<input[high]){
                high=mid;//high是直接等于mid而不是mid-1
            }
            else {
                high=high-1;
            }
        }
        System.out.println(input[low]);
    }
}

