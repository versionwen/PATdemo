package com.offer;

import com.sun.scenario.effect.Merge;

/**
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Offer17 {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode result=null;
        if(list1==null)
            return list2;
        else if (list2==null){
            return list1;
        }
        if (list1.val<list2.val){
            result=list1;
            result.next=Merge(list1.next,list2);
        }
        else {
            result=list2;
            result.next=Merge(list1,list2.next);
        }
        return result;
    }
    public static void main(String[] args) {
        ListNode wx=new ListNode(1);
        ListNode wx1=new ListNode(2);
        ListNode wx2=new ListNode(3);
        ListNode wx3=new ListNode(4);
        ListNode wx4=new ListNode(10);
        ListNode wx5=new ListNode(20);
        ListNode wx6=new ListNode(30);
        ListNode wx7=new ListNode(40);
        wx.next=wx1;
        wx1.next=wx2;
        wx2.next=wx3;
        wx4.next=wx5;
        wx5.next=wx6;
        wx6.next=wx7;
        ListNode merge= Merge(wx, wx4);
        while (merge!=null){
            System.out.println(merge.val);
            merge=merge.next;
        }
    }
}
