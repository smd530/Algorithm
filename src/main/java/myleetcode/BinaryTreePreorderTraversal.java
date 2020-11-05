package myleetcode;

import basicdatastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树前序遍历 144
 *
 * @author shanmingda
 * @date 2020-11-05 21:30
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    public void preOrder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        preOrder(node.left, res);
        preOrder(node.right, res);
    }
}
