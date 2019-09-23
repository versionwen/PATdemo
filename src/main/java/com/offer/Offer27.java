package com.offer;

import java.security.Permission;
import java.util.ArrayList;
import java.util.Collections;

public class Offer27 {
   public ArrayList<String>permutation(String str){
       ArrayList<String>list=new ArrayList<>();
       if(str==null||str.length()==0){
           return list;
       }
        collect(str.toCharArray(),0,list);//把str转化为char
       Collections.sort(list);
       return list;
   }
   public static void collect(char[] chars,int begin,ArrayList<String>list){
       if(begin==chars.length-1){
           String s=String.valueOf(chars);
           if(!list.contains(s)){
               list.add(s);
               return;
           }
       }
       for(int i=begin;i<chars.length;i++){
           swap(chars,i,begin);
           collect(chars,begin+1,list);
           swap(chars,i,begin);
       }
   }
    public static void swap(char[] chars,int i,int j){
       char temp=chars[j];
       chars[j]=chars[i];
       chars[i]=temp;
    }

    public static void main(String[] args) {
       Offer27 permulation=new Offer27();
        System.out.println(permulation.permutation("abc"));
    }
}
