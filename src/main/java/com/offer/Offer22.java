package com.offer;

import java.util.Stack;

/**
 * 题目描述
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 *解题思路：
 * 用一个栈来存储输入，用栈顶数字和输出进行比较，最后看栈是否为空
 */
public class Offer22 {
    public static boolean IsPopOrder(int [] pushA,int [] popA){
        if(pushA==null||popA==null){
            return false;
        }
        Stack<Integer>in=new Stack<>();
        int j=0;
        for (int i=0;i<pushA.length;i++){
            in.push(pushA[i]);
            while (!in.isEmpty()&&popA[j]==in.peek()){//特别注意这个位置的循环条件
                in.pop();
                j++;
            }
        }
        boolean result=in.empty();
        return result;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={5,4,3,2,1};
        boolean isPopOrder = IsPopOrder(a, b);
        System.out.println(isPopOrder);
    }
}
