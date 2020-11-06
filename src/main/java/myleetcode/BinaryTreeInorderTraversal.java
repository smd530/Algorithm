package myleetcode;

import basicdatastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历二叉树 lee 94
 *
 * @author shanmingda
 * @date 2020-09-17 16:30
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
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


    public void inOrder(TreeNode root) {
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

}
