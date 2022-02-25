package com.letcode.base;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void addNode(int val) {
        if (this.next == null) {
            this.next = new ListNode(val);
        } else {
            this.next.addNode(val);
        }
    }

    @Override
    public String toString() {
        StringBuffer a = new StringBuffer();
        ListNode p = this;
        a.append(val);
        while (p.next != null) {
            a.append(" " + p.next.val);
            p = p.next;
        }
        return "[" + a.toString() + "]";
    }
}
