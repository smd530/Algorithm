package myleetcode;

import basicdatastructure.ListNode;

import java.util.Arrays;

/**
 * 移除链表元素 leetcode 203
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 *
 * @author shanmingda
 * @date 2020-11-02 11:38
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        ListNode dummuHead = new ListNode(-1);
        ListNode cur = head;
        dummuHead.next = head;
        while (cur.next != null) {
            ListNode delNode = cur.next;
            if (cur.next.val == val) {
                cur.next = delNode.next;
            } else {
                cur = cur.next;
            }
        }
        return dummuHead.next;
    }


}
