package com.ironass.datastruct;

public class ListNode {
    public Integer value;

    public ListNode next;

    public ListNode(Integer value) {
        this.value = value;
    }

    public ListNode(Integer value, ListNode next){
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
