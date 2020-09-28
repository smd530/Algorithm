package BST;

/**
 * 二分搜索树
 * 存储的元素必须要有可比较性 所以要继承Comparable接口
 *
 * @author shanmingda
 * @date 2020-09-28 14:48
 */
public class BST<E extends Comparable<E>> {

    /**
     * 之所以要将节点类创建为私有内部类
     * 是因为 二分搜索树的节点类的实现对用户来说没有必要可见
     */
    private class Node {

        public E e;

        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    /**
     * 根节点
     */
    private Node root;

    /**
     * 存储了多少个元素
     */
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向二分搜索树中添加新的元素e
     * @param e
     */
    public void add(E e) {

       root = add(root, e);
    }

    /**
     * 向以node为根的二分搜索树中插入元素E 递归算法
     * 返回插入新节点后二分搜索树的根
     * @param node
     * @param e
     */
    private Node add(Node node, E e) {
        // 递归终止条件

        if (node == null) {
            size ++;
            return new Node(e);
        }

        if (e.compareTo(e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(e) > 0) {
            node.right = add(node.right, e);
        }

        return node;
    }
}
