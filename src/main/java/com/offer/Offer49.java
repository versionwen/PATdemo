package com.offer;

/**
 * @author version
 * @version 1.0
 * @date 2020/3/25 21:53
 */
/*
输入两个单调递增的链表，
输出两个链表合成后的链表，
当然我们需要合成后的链表满足单调不减规则。
 */
public class Offer49 {
    public ListNode Merge(ListNode list1,ListNode list2) {
            ListNode res=new ListNode(-1);
            ListNode p=res;
            while (list1!=null&&list2!=null){
                if(list1.val<=list2.val){
                    p.next=list1;
                    list1=list1.next;
                }
                else {
                    p.next=list2;
                    list2=list2.next;
                }
                p=p.next;
            }
            if(list1!=null){
                p.next=list1;
            }
            if(list2!=null){
                p.next=list2;
            }
            return res.next;
    }

    public static void main(String[] args) {
        ListNode One=new ListNode(1);
        ListNode Two=new ListNode(3);
        ListNode Three=new ListNode(5);
        ListNode Four=new ListNode(7);
        ListNode Five=new ListNode(9);
        One.next=Two;
        Two.next=Three;
        Three.next=Four;
        Four.next=Five;
        ListNode One1=new ListNode(2);
        ListNode Two1=new ListNode(4);
        ListNode Three1=new ListNode(6);
        ListNode Four1=new ListNode(8);
        ListNode Five1=new ListNode(10);
        One1.next=Two1;
        Two1.next=Three1;
        Three1.next=Four1;
        Four1.next=Five1;
        Offer49 wx=new Offer49();
        System.out.println(wx.Merge(One,One1).val);
    }
}
