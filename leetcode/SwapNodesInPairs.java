import java.util.Objects;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        // 예외 처리
        int len = 0;
        ListNode node = head;
        while (Objects.nonNull(node)) {
            ++len;
            node = node.next;
        }
        if (len < 2) {
            return head;
        }

        ListNode result = head.next;
        ListNode pre = new ListNode(0, head);
        ListNode cur = head;
        ListNode next = head.next;
        while (true) {
            pre.next = next;
            cur.next = next.next;
            next.next = cur;
            if (Objects.isNull(cur.next) || Objects.isNull(cur.next.next))
                break;
            pre = cur;
            cur = cur.next;
            next = cur.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode result;

        result = new SwapNodesInPairs().swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        while (Objects.nonNull(result)) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println();

        result = new SwapNodesInPairs().swapPairs(null);
        while (Objects.nonNull(result)) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println();

        result = new SwapNodesInPairs().swapPairs(new ListNode(1));
        while (Objects.nonNull(result)) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println();
    }

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
}
