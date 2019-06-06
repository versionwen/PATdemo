package com.offer;

import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Six {
    public List newqueuepush(int[] input){
        List push=new ArrayList();
        Stack<Integer>S1=new Stack<>();
        Stack<Integer>S2=new Stack<>();
        for(int i=0;i<input.length;i++){
            S1.push(input[i]);
        }
        while (!S1.empty()){
            S2.push(S1.pop());
        }
        while (!S2.empty()){
            push.add(S2.pop());
        }
        return push;
    }
    public int newqueuepop(ArrayList<Integer> output){
        int temp=0;
        int count=0;
        Stack<Integer>S1=new Stack<>();
        Stack<Integer>S2=new Stack<>();
        for(int i=0;i<output.size();i++){
            S1.push(output.remove(i));
        }
        while (!S1.empty()){
            S2.push(S1.pop());
        }
        if(count<output.size()){
            temp=S2.pop();
            count++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] input={1,2,3,4,5,6};

    }
}
