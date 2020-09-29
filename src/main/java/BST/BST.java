package BST;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Stack;

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

        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }

        return node;
    }

    /**
     * 添加非递归方法
     * @param e
     */
    private void add2(E e) {
        if (root == null) {
            root = new Node(e);
            size ++;
        } else {
            Node cur = root;
            while (true) {
                if (e.compareTo(cur.e) == 0) {
                    return;
                } else if (e.compareTo(cur.e) < 0 && cur.left == null) {
                    cur.left = new Node(e);
                    size ++;
                    return;
                } else if (e.compareTo(cur.e) > 0 && cur.right == null) {
                    cur.right = new Node(e);
                    size ++;
                    return;
                }

                if (e.compareTo(cur.e) < 0) {
                    cur = cur.left;
                } else {
                    cur = cur.right;
                }
            }
        }
    }

    /**
     * 查看二分搜索树是否包含元素e
     * @param e
     * @return
     */
    public boolean contains(E e) {

        return contains(root, e);
    }

    /**
     * 查看以node为根的二分搜索树中是否包含元素e 递归算法
     * @param node
     * @param e
     * @return
     */
    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        } else {
            return contains(node.right, e);
        }
    }

    /**
     * 二分搜索树前序遍历
     */
    public void preOrder() {
        preOrder(root );
    }

    /**
     * 前序遍历以node为根的二分搜索树 递归算法
     * @param node
     */
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 二分搜索树非递归前序遍历
     */
    public void preOrderNR() {

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node cur = stack.pop();
            System.out.println(cur.e);

            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }

    }


    /**
     * 二分搜索树中序遍历
     */
    public void inOrder() {
        inOrder(root);
    }

    /**
     * 中序遍历以node为根的二分搜索树 递归算法
     * 二分搜索树的中序遍历结果是顺序的
     * @param node
     */
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    /**
     * 二分搜索树的后序遍历
     */
    public void postOrder() {
        postOrder(root);
    }

    /**
     * 后序遍历以node为根的二分搜索树 递归算法
     * 后序遍历可以用来为二分搜索树释放内存
     * 因为要先遍历所有的孩子节点再遍历根节点
     * @param node
     */
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    /**
     * 生成以node为根节点 深度为depth的描述二叉树的字符串
     * @param node
     * @param depth
     * @param res
     */
    private void generateBSTString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(generateDepthString(depth) + "null\n");
            return;
        }

        res.append(generateDepthString(depth) + node.e + "\n");
        String str = res.toString();
        generateBSTString(node.left, depth + 1, res);
        generateBSTString(node.right, depth + 1, res);
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }
}
