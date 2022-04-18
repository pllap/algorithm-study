public class LC230 {
    public int kthSmallest(TreeNode root, int k) {
        int[] count = new int[]{k};
        int[] answer = new int[1];
        inOrder(root, count, answer);
        return answer[0];
    }

    void inOrder(TreeNode root, int[] count, int[] answer) {
        if (root != null) {
            inOrder(root.left, count, answer);
            if (--count[0] == 0) {
                answer[0] = root.val;
                return;
            }
            inOrder(root.right, count, answer);
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
