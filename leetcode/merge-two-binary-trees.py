from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def mergeTrees(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> Optional[TreeNode]:

        if not root1:
            return root2
        if not root2:
            return root1

        def dfs(root1: TreeNode, root2: TreeNode):
            root1.val += root2.val
            if root2.left:
                if root1.left:
                    dfs(root1.left, root2.left)
                else:
                    root1.left = root2.left
            if root2.right:
                if root1.right:
                    dfs(root1.right, root2.right)
                else:
                    root1.right = root2.right

        dfs(root1, root2)

        return root1
