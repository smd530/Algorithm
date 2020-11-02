package myleetcode;

import basicdatastructure.ListNode;

/**
 * 删除链表的倒数第N个节点 lee 19
 *
 * @author shanmingda
 * @date 2020-11-02 17:50
 */
public class RemoveNthNodeFromEndOfList {

    /**
     * 解法一
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = getLength(head);
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        for (int i = 0; i < length - n; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }

    public int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length ++;
            head = head.next;

        }
        return length;
    }

    /**
     * 解法二
     */

    public ListNode removeNthFromEnd2(ListNode head, int n) {

        if (n < 0) {
            return null;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode p = dummyHead;
        ListNode q = dummyHead;

        for (int i = 0; i < n + 1; i++) {
            q = q.next;
        }

        while (q != null) {
            p = p.next;
            q = q.next;
        }

        p.next = p.next.next;

        return dummyHead.next;
    }

}
