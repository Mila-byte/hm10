package org.example;

public class Main {
    private static ListNode head;

    public static void main(String[] args) {
    }

    public void init(int[] arr) {
        head = createHead(arr);
        head = reverseList(head);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static ListNode createHead(int[] arr) {
        ListNode head = null;
        ListNode tail = null;
        for (int j : arr) {
            ListNode node = new ListNode(j);
            if (head == null) {
                head = node;
            } else {
                tail.setNext(node);
            }
            tail = node;
        }
        return head;
    }

    public ListNode getHead() {
        return head;
    }
}