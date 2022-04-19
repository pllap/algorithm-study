import java.util.ArrayList;
import java.util.List;

public class LC99 {
    // https://leetcode.com/problems/recover-binary-search-tree/
    public void recoverTree(TreeNode root) {
        // traverse bst
        List<TreeNode> nodes = new ArrayList<>();
        inOrder(root, nodes);

        // find swapped two nodes
        TreeNode prev = null;
        TreeNode next = null;
        int numNodes = nodes.size();
        for (int i = 0; i < numNodes - 1; ++i) {
            if (nodes.get(i).val > nodes.get(i + 1).val) {
                if (prev == null) {
                    prev = nodes.get(i);
                }
                next = nodes.get(i + 1);
            }
        }

        // swap two nodes
        if (prev != null && next != null) {
            int temp = prev.val;
            prev.val = next.val;
            next.val = temp;
        }
    }

    void inOrder(TreeNode root, List<TreeNode> nodes) {
        if (root != null) {
            inOrder(root.left, nodes);
            nodes.add(root);
            inOrder(root.right, nodes);
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

    public static void main(String[] args) {
        TreeNode root;

        root = new TreeNode(1, new TreeNode(3, null, new TreeNode(2)), null);
        new LC99().recoverTree(root);

        root = new TreeNode(3, new TreeNode(1), new TreeNode(4, new TreeNode(2), null));
        new LC99().recoverTree(root);
    }
}
