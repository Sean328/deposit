package com.ironass.algo;

import com.ironass.datastruct.ListNode;

/**
 * 参考文章：https://www.cnblogs.com/keeya/p/9218352.html
 */
public class ReverseListNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode second = new ListNode(0);
        ListNode third = new ListNode(6);
        ListNode forth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = forth;

        System.out.println(head);

//        ListNode afterReverse = reverseNodeTraverse(head);
        ListNode afterReverse = reverseListNodeRecursive(head);
        System.out.println(afterReverse);
    }

    private static ListNode reverseNodeTraverse(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    private static ListNode reverseListNodeRecursive(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head.next;
        ListNode newHead = reverseListNodeRecursive(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }

}
