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
}
