package myleetcode;

import basicdatastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历二叉树
 *
 * @author shanmingda
 * @date 2020-09-17 16:30
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        List<Integer> left = inorderTraversalRecursive(root.left);
        List<Integer> right = inorderTraversalRecursive(root.right);
        left.add(root.val);
        right.addAll(left);
        return left;
    }
}
