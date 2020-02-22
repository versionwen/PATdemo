package com.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author version
 * @version 1.0
 * @date 2020/2/22 20:20
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class Offer39 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer>list=new ArrayList<>();
            Stack<Integer>temp=new Stack<>();
            while (listNode!=null){
                temp.push(listNode.val);
                listNode=listNode.next;
            }
            while (!temp.isEmpty()){
                list.add(temp.pop());
            }
            return list;
    }

    public static void main(String[] args) {
        ListNode wx1=new ListNode(1);
        ListNode wx2=new ListNode(2);
        ListNode wx3=new ListNode(3);
        ListNode wx4=new ListNode(4);
        wx1.next=wx2;
        wx2.next=wx3;
        wx3.next=wx4;
        Offer39 t=new Offer39();
        System.out.println(t.printListFromTailToHead(wx1));
    }
}
