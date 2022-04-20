import java.util.ArrayList;
import java.util.List;

public class LC173 {

    static class BSTIterator {

        private final List<Integer> nodes;
        private int size;
        private int index;

        public BSTIterator(TreeNode root) {
            nodes = new ArrayList<>();
            inOrder(root, nodes);
            index = 0;
            size = nodes.size();
        }

        public int next() {
            return nodes.get(index++);
        }

        public boolean hasNext() {
            return index < size;
        }

        private void inOrder(TreeNode root, List<Integer> nodes) {
            if (root != null) {
                inOrder(root.left, nodes);
                nodes.add(root.val);
                inOrder(root.right, nodes);
            }
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
