package myleetcode;

import basicdatastructure.ListNode;

/**
 * 删除链表中的节点 lee 237
 *
 * 这道题细思极恐：如何让自己在世界上消失，但又不死？ —— 将自己完全变成另一个人，再杀了那个人就行了。
 * @author shanmingda
 * @date 2020-11-02 17:33
 */
public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
