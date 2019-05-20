package com.other;

/**
 * 一句话返回6位数字验证码
 */
public class CheckNumber {
    public static void main(String[] args) {
        int out=(int)((((Math.random()*10)+1))*100000);
        System.out.println(out);
    }
}
