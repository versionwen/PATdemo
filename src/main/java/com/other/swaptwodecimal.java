package com.other;
/**
 * a与b一定不能相同，这是异或交换的前提
 */
public class swaptwodecimal {
    public static void main(String[] args) {
        int a=10,b=5;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+","+"b="+b);
    }
}
