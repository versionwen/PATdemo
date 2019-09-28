package com.offer;

import java.util.HashMap;

public class Offer34 {
    public static int FirstNotRepeatingChar(String str){
        int len=str.length();
        if(len==0){
            return -1;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(str.charAt(i))){//包含就进行+1操作
                int value=map.get(str.charAt(i));
                map.put(str.charAt(i),value+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<len;i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("bbcccaddd"));
    }
}
