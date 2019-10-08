package com.offer;

public class Offer36 {
    public int getlength(ListNode p) {//求链表的长度
        int count = 0;
        while (p.next != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public ListNode firstgo(ListNode p, int length) {//走到公共长度
        while (length != 0) {
            p = p.next;
            length--;
        }
        return p;
    }

    public  ListNode FindfirstCommonNode(ListNode phead1, ListNode phead2) {//找到公共节点
        if (phead1 == null || phead2 == null) {
            return null;
        }
        int plen1 = getlength(phead1);
        int plen2 = getlength(phead2);
        if (plen1 > plen2) {//让长的先走
            phead1 = firstgo(phead1, plen1 - plen2);
        } else {
            phead2 = firstgo(phead2, plen2 - plen1);
        }
        while (phead1 != null) {//找到相同的节点
            if (phead1 == phead2) {
                break;
            } else {
                phead1 = phead1.next;
                phead2 = phead2.next;
            }
        }
        return phead1;
    }
    public static void main(String[] args) {
        Offer36 pn = new Offer36();
        ListNode p1 = new ListNode(8, null);
        ListNode head1 = p1;
        ListNode p2 = new ListNode(9, null);
        ListNode head2 = p2;
        for (int i = 0; i < 5; i++) {
            ListNode p = new ListNode(i, null);
            if (i < 2) {
                p1.next = p;
                p1 = p;
            } else {
                p1.next = p;
                p1 = p;
                p2.next = p;
                p2 = p;
            }
        }
        System.out.println(pn.FindfirstCommonNode(p1,p2).val);
    }
}

