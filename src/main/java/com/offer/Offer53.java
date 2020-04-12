package com.offer;

import java.util.Stack;

/**
 * @author version
 * @version 1.0
 * @date 2020/4/8 22:55
 */
/*
定义栈的数据结构，
请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Offer53 {
    Stack<Integer>stackTotal=new Stack<>();
    Stack<Integer>stackLittle=new Stack<>();
    public void push(int node) {
        stackTotal.push(node);
        if(stackLittle.empty()){
            stackLittle.push(node);
        }
        else {
            if(node<=stackLittle.peek()){
                stackLittle.push(node);
            }
            else {
                stackLittle.push(stackLittle.peek());
            }
        }
    }

    public void pop() {
          stackTotal.pop();
          stackLittle.pop();
    }

    public int top() {
        return stackTotal.peek();
    }

    public int min() {
        return stackLittle.peek();
    }
    public static void main(String[] args) {
       Offer53 wx=new Offer53();
       wx.push(1);
       wx.push(2);
       wx.push(3);
       int res=wx.min();
        System.out.println(res);
    }
}
