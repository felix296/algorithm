package com.tp.normal;

/**
 * Created on 2019/5/28.
 * <p>
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class TwoLinkedNodeSum {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode li_next = new ListNode(33);
        li_next.next = new ListNode(3);
        l1.next = li_next;

        ListNode l2 = new ListNode(5);
        ListNode l2_next = new ListNode(9);
        l2_next.next = new ListNode(4);
        l2.next = l2_next;
        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //创建临时头节点.
        ListNode head = new ListNode(-1);
        //创建临时节点，用来一直跟踪返回链表的最后一个节点.
        ListNode temp = head;
        int carry = 0;
        while (null != l1 || l2 != null || carry != 0) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + carry;
            //更新进位值.
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            //l1和l2后移
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return head.next;
    }
}
