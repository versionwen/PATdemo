package com.offer;

/**
 * @author version
 * @version 1.0
 * @date 2020/3/19 22:25
 */
/*
输入一个链表，输出该链表中倒数第k个结点。
 */
public class Offer47 {
    public ListNode FindKthToTail(ListNode head,int k) {
            ListNode First=new ListNode(0);
            ListNode res=new ListNode(0);
            First=head;
            res=head;
            int count=1;
            if(k==0){
                return null;
            }
            if(head==null){
                return null;
            }
            while (count<k&&First!=null){
                First=First.next;
                count++;
            }
            if(First==null){
            return null;
        }
            while (First.next!=null){
                First=First.next;
                res=res.next;
            }
            return res;
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
        Offer47 wx=new Offer47();
        System.out.println(wx.FindKthToTail(One,1).val);
    }
}
