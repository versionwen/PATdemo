package com.offer;

/**
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Offer16 {
    public static ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
       ListNode pH=null;
       ListNode pR=head;
       while (pR!=null){
           pH.next=pR;
           pR=pR.next;
       }
       return pH;
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
        System.out.println(listNode.val);

    }
}

