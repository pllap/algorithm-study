import java.util.Stack;

public class LC538 {

    public TreeNode convertBST(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        inOrder(root, stack);

        int sum = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            sum += node.val;
            node.val = sum;
        }

        return root;
    }

    private void inOrder(TreeNode root, Stack<TreeNode> stack) {
        if (root != null) {
            inOrder(root.left, stack);
            stack.push(root);
            inOrder(root.right, stack);
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
