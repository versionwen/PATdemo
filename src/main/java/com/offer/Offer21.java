package com.offer;

import java.util.Stack;

/**
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * 解题思路：
 * 我们定义一个临时的栈的数据结构，每次入栈时记录下最小的那个数字就行
 * 举个例子
 * 入栈顺序为  8 9 5 2 0
 * temp栈存在的数字为 8 8 5 2 0，即最小数字一定在temp栈的顶部，到时候我们只要get temp栈顶部数字就能得到最小那个数字
 */

public class Offer21 {
        Stack<Integer>stack=new Stack<>();
        Stack<Integer>temp=new Stack<>();
        public void push(int node){
            int tempnode=Integer.MIN_VALUE;
            if(node>=tempnode){
                tempnode=node;
                stack.push(node);
                if(temp.empty()) {
                    temp.push(node);
                }
            }
            else {
                stack.push(node);
                temp.push(tempnode);
            }
        }
        public void pop(int node){
            stack.pop();
            temp.pop();

        }
        public int min(){
            return temp.peek();
        }
}
