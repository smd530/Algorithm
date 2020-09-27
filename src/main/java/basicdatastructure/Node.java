package basicdatastructure;

import java.util.List;

/**
 * TODO
 *
 * @author shanmingda
 * @date 2020-09-20 22:59
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

