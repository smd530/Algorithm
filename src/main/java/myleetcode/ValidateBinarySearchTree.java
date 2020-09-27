package myleetcode;

import basicdatastructure.TreeNode;

/**
 * 验证二叉搜索树 leetcode 98
 *
 * @author shanmingda
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return valid(root, null, null);
    }

    private boolean valid(TreeNode node, Integer lower, Integer upper) {
        int val = node.val;

        if (lower != null && val <= lower) {
            return false;
        }
        if (upper != null && val >= upper) {
            return false;
        }
        if (!valid(node.right, val, upper)) {
            return false;
        }
        if (!valid(node.left, lower, val)) {
            return false;
        }

        return true;
    }

}
