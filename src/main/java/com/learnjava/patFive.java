package com.learnjava;


import java.util.Scanner;
import java.util.Stack;

public class patFive {
    public static void main(String[] args) {
        Stack<Integer>result=new Stack<Integer>();
        Scanner input=new Scanner(System.in);
        Integer num=input.nextInt();
        while (num!=1){
            if(num%2==0){
                num=num/2;
                result.push(num);
            }
            else {
                num=((num*3)+1)/2;
                result.push(num);
            }
        }
        while (!result.empty()){
            System.out.println(result.pop());
        }
    }
}
