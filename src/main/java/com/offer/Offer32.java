package com.offer;

import java.util.Arrays;
import java.util.Comparator;

public class Offer32 {
    public static String PrintMinNumber(int[] numbers){
        int len=numbers.length;
        if(len==0){
            return "";
        }
        if(len==1){
            return String.valueOf(numbers[0]);
        }
        StringBuffer res=new StringBuffer();
        String[] str=new String[len];
        for(int i=0;i<len;i++){
            str[i]=String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {//ab>ba,a>b
                String c1=o1+o2;//ab<ba,a<b
                String c2=o2+o1;//ab=ba,a=b
                return c1.compareTo(c2);
            }
        });
        for(int i=0;i<len;i++){
            res.append(str[i]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int[] wx={3,32,321};
        System.out.println(PrintMinNumber(wx));
    }
}
