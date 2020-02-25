package com.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author version
 * @version 1.0
 * @date 2020/2/25 20:42
 */
/*
用两个栈来实现一个队列，完成队列的Push和Pop操作。
队列中的元素为int类型。
 */
public class Offer41 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    ArrayList<Integer>input=new ArrayList<>();
    int i=0;
    public void push(int node) {
        stack1.push(node);
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        while (!stack2.empty()){
            input.add(stack2.pop());
        }
    }

    public int pop() {
       int temp=0;
       if (i<input.size()){
           temp=input.get(i);
           i++;
           return temp;
       }
       return temp;

    }

    public static void main(String[] args) {
        Offer41 wx=new Offer41();
        wx.push(1);
        wx.push(2);
        wx.push(3);
        int test=wx.pop();
        int t2=wx.pop();
        System.out.println(test);
        System.out.println(t2);
    }
}
