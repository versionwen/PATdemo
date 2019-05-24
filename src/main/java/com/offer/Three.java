package com.offer;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
 */
public class Three {
    public static void main(String[] args) {
        LinkedList<Integer>input=new LinkedList<>();
        Stack<Integer>stack=new Stack<>();
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        while (i!=0){
            input.add(i);
            i=in.nextInt();

        }
        while (!input.isEmpty()) {
            stack.push(input.pollFirst());
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
