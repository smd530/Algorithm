package myleetcode;

import basicdatastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树后序遍历 lee 145
 *
 * @author shanmingda
 * @date 2020-11-05 21:43
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root, res);
        return res;
    }

    private void postOrder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        postOrder(root.left, res);
        postOrder(root.right, res);
        res.add(root.val);
    }


}
