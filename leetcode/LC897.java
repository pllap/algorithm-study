import java.util.ArrayList;
import java.util.List;

public class LC897 {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inOrder(root, values);
        TreeNode result = new TreeNode();
        TreeNode resultRoot = result;
        for (int value : values) {
            result.right = new TreeNode();
            result = result.right;
            result.val = value;
        }
        return resultRoot.right;
    }

    private void inOrder(TreeNode root, List<Integer> values) {
        if (root != null) {
            inOrder(root.left, values);
            values.add(root.val);
            inOrder(root.right, values);
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
