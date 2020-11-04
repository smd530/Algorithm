package myleetcode;

import basicdatastructure.TreeNode;

/**
 * 反转二叉树 lee 226
 *
 * @author shanmingda
 * @date 2020-11-04 17:41
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
