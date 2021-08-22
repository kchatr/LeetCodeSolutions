public class SymmetricTree {

    // Definition for a binary tree node.
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

    public boolean symmetry(TreeNode left, TreeNode right) {
        if (left == null) {
            if (right == null) {
                return true;
            } else {
                return false;
            }
        } else if (right == null) {
            if (left == null) {
                return true;
            } else {
                return false;
            }
        } else {
            if (left.val == right.val) {
                return symmetry(left.left, right.right) && symmetry(left.right, right.left);
            } else {
                return false;
            }
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return symmetry(root.left, root.right);
    }

}
