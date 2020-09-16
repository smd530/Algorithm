package linkedList;

public class LinkedList<E> {
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);

        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "e=" + e +
                    ", next=" + next +
                    '}';
        }
    }

    private Node head;

    private int size;

    public LinkedList(Node head, int size) {
        head = null;
        size = 0;
    }

    // 获取链表的长度
    public int getSize() {
        return size;
    }

    // 返回链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 在链表头添加元素e
    public void addFirst(E e) {
//        Node node = new Node();
//        node.next = head;
//        head = node;
        // 上面三句可以用下面这一句代替 优秀！
        head = new Node(e, head);
        size ++;
    }

    // 在链表的index(0-based)位置插入元素
    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed, Illegal index");

        if (index == 0) {
            addFirst(e);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++)
                prev = prev.next;

            Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;
            // 上面三句可以优化成这一句 屌！
            prev.next = new Node(e, prev.next);

            size ++;
        }
    }

    // 在链表末尾添加元素
    public void addLast(E e) {
        add(size, e);
    }


}
