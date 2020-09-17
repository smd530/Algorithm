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

    public List<Integer> inorderTraversal(TreeNode root) {

        // 方式一 递归
        List<Integer> res = new ArrayList<Integer>();
        inorderTraversalRecursive(root, res);
        return res;
    }

    public void inorderTraversalRecursive(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorderTraversalRecursive(root.left, res);
        res.add(root.val);
        inorderTraversalRecursive(root.right, res);
    }
}
