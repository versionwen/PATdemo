package com.offer;

/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Offer15 {
    public static ListNode FindKthToTail(ListNode head,int k) {
            int LengthList,i;
            if(head==null||k==0)
                return null;
            ListNode length=head;
            for(i=0;length.next!=null;i++){
                length=length.next;
            }
            LengthList=i;
            if(k>LengthList){
                return null;
            }
            ListNode Pa=head;
            ListNode Pb=head;
            for (int j=0;j<k-1;j++){
                Pa=Pa.next;
            }
            while (Pa.next!=null){
                Pa=Pa.next;
                Pb=Pb.next;
            }
            return Pb;
    }

    public static void main(String[] args) {
        ListNode wx=new ListNode(1);
        ListNode wx1=new ListNode(2);
        ListNode wx2=new ListNode(3);
        ListNode wx3=new ListNode(4);
        wx.next=wx1;
        wx1.next=wx2;
        wx2.next=wx3;
        ListNode listNode = FindKthToTail(wx, 2);
        System.out.println(listNode.val);

    }
}
