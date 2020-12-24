package com.tp.normal;

import lombok.ToString;

/**
 * @author chenfeifei8090@100.me
 * @program timo
 * @date 2020-10-13 19:34
 * @desc
 **/
public class P24 {

    /**
     * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
     *
     * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换
     */

    @ToString
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static ListNode swapPairs(ListNode head) {
        //至少两个节点
        if(head == null || head.next == null){
            return head;
        }

        return swapPairs(head);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println(swapPairs(head).toString());
    }

}
