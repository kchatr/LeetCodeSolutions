public class MaximumDepthOfBinaryTree {
    public class TreeNode {
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

    int max = 0;

    public void helper(TreeNode root, int counter) {
        if (root == null) {
            if (counter > max) {
                max = counter;
            }
            return;
        } else {
            // Remember that ++counter operates upon the counter variable directly, mutating its value
            helper(root.left, ++counter);
            helper(root.right, counter);
        }
    }

    public int maxDepth(TreeNode root) {
        helper(root, 0);
        return max;
    }
}
