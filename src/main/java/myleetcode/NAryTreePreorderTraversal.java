package myleetcode;

import basicdatastructure.Node;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * N叉树的前序遍历
 *
 * @author shanmingda
 * @date 2020-09-20 22:58
 */
public class NAryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<Node>();
        LinkedList<Integer> output = new LinkedList<Integer>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for (Node item : node.children) {
                stack.add(item);
            }
        }
        return output;
    }

}
