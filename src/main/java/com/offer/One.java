package com.offer;

import java.util.Scanner;

/**
 * 题目描述
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class One {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String result=input.nextLine();
        StringBuffer output=new StringBuffer();
        for(int i=result.length()-1;i>-1;i--){
            if((String.valueOf(result.charAt(i))).equals(" ")){
                output=output.append("02%");
            }
            else
                output=output.append(result.charAt(i));
        }
        String out=output.reverse().toString();
        System.out.println(out);
    }
}
