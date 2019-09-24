package com.offer;

import java.util.HashMap;
import java.util.Map;

public class Offer28 {
    public static int MoreThanHalfNum(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length=array.length;//记录数组长度
        for(int i=0;i<length;i++){//遍历数组用hashtable记录每一个数字出现的次数
            if(!map.containsKey(array[i])){//没有在hashtable出现，那么就加入hashtable
                map.put(array[i],1);
            }
            else{//数字计数加一
                map.put(array[i],map.get(array[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){//遍历hashtable
            if(entry.getValue()*2>length){//找到长度超过一半的那个数字
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] wx={1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum(wx));
    }
}
