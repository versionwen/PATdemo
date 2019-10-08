package com.offer;

public  class ListNode {
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
