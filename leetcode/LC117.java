import java.util.*;

public class LC117 {

    public Node connect(Node root) {

        if (root == null) {
            return null;
        }

        // bfs로 구현
        // 매번 다음 노드들을 bfs로 큐에 담고, 큐에서 꺼내서 다음 노드를 next로 삼는다
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; ++i) {
                Node node = queue.remove();
                node.next = i == queueSize - 1 ? null : queue.peek();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return root;
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
