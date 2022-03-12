package com.pllap.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC138 {

    public Node copyRandomList(Node head) {

        Map<Node, Node> originalToCopyMap = new HashMap<>();
        Node node = head;
        Node copied = new Node(0);
        Node copiedNode = copied;
        while (node != null) {
            copiedNode.next = new Node(node.val);
            originalToCopyMap.put(node, copiedNode.next);
            node = node.next;
            copiedNode = copiedNode.next;
        }

        node = head;
        copiedNode = copied.next;
        while (node != null) {
            if (node.random == null) {
                node = node.next;
                copiedNode = copiedNode.next;
                continue;
            }
            copiedNode.random = originalToCopyMap.get(node.random);
            node = node.next;
            copiedNode = copiedNode.next;
        }

        return copied.next;
    }

    public static void main(String[] args) {
        Node first;
        Node second;
        Node third;
        Node fourth;
        Node fifth;

        first = new Node(7);
        second = new Node(13);
        third = new Node(11);
        fourth = new Node(10);
        fifth = new Node(1);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        first.random = null;
        second.random = first;
        third.random = fifth;
        fourth.random = third;
        fifth.random = first;
        new LC138().copyRandomList(first);

        first = new Node(1);
        second = new Node(2);
        first.next = second;
        second.next = null;
        first.random = second;
        second.random = second;
        new LC138().copyRandomList(first);

        first = new Node(1);
        second = new Node(2);
        third = new Node(3);
        first.next = second;
        second.next = third;
        third.next = null;
        first.random = null;
        second.random = first;
        third.random = null;
        new LC138().copyRandomList(first);
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
