package com.learnjava;

import jdk.internal.dynalink.beans.StaticClass;

import java.util.Scanner;

public class patOne {
    static int i=0;
    public static int result(int count){
        if(count==1){
            return i;
        }
        else  if(count%2==0){
            i++;
            return result(count/2);
        }
        else {
            i++;
            return result(((3 * count )+ 1 )/ 2);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.print(result(num));
    }
}
