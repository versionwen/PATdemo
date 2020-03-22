package com.offer;

import java.util.Stack;

/**
 * @author version
 * @version 1.0
 * @date 2020/3/20 21:47
 */
/*
输入一个链表，反转链表后，输出新链表的表头
 */
public class Offer48 {
    public ListNode ReverseList(ListNode head) {
       ListNode res=null,temp=head,res2=null;
       Stack<ListNode>out=new Stack<>();
       while (temp!=null){
          out.push(temp);
          temp=temp.next;
       }
       while(!out.isEmpty()){
           res=out.pop();
           if(!out.isEmpty()){
               res.next=out.pop();
           }
       }
    }

    public static void main(String[] args) {
        ListNode One=new ListNode(1);
        ListNode Two=new ListNode(2);
        ListNode Three=new ListNode(3);
        ListNode Four=new ListNode(4);
        ListNode Five=new ListNode(5);
        One.next=Two;
        Two.next=Three;
        Three.next=Four;
        Four.next=Five;
        Offer48 wx=new Offer48();
        System.out.println(wx.ReverseList(One).val);
    }
}
