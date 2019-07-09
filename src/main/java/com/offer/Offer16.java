package com.offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Offer16 {
    public static ListNode ReverseList(ListNode head) {
        if (head==null){
            return null;
        }
        if(head == null)
            return null;
        ListNode pre = null;
        ListNode next = null;

        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
    public static void main(String[] args) {
        ListNode wx=new ListNode(1);
        ListNode wx1=new ListNode(2);
        ListNode wx2=new ListNode(3);
        ListNode wx3=new ListNode(4);
        wx.next=wx1;
        wx1.next=wx2;
        wx2.next=wx3;
        ListNode listNode =ReverseList(wx);
        while (listNode!=null) {
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
}

