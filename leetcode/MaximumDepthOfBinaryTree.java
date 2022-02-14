import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (Objects.isNull(root)) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int step = 0;
        while (queue.size() > 0) {
            ++step;
            int numChildren = queue.size();
            for (int i = 0; i < numChildren; ++i) {
                TreeNode node = queue.poll();
                if (Objects.isNull(node)) {
                    break;
                }
                if (Objects.nonNull(node.left)) {
                    queue.add(node.left);
                }
                if (Objects.nonNull(node.right)) {
                    queue.add(node.right);
                }
            }
        }

        return step;
    }

    public static void main(String[] args) {
        TreeNode root;

        root = new TreeNode(3,
                new TreeNode(9), new TreeNode(20,
                new TreeNode(15), new TreeNode(7)
        )
        );
        System.out.println(new MaximumDepthOfBinaryTree().maxDepth(root));

        root = new TreeNode(1, null, new TreeNode(2));
        System.out.println(new MaximumDepthOfBinaryTree().maxDepth(root));
    }
}

class TreeNode {
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
