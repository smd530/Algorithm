package linkedList;

import basicdatastructure.ListNode;

/**
 * TODO
 *
 * @author shanmingda
 * @date 2020-10-29 22:49
 */
public class LinkedListDemo {

    public static ListNode reverseNode(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }





    public static void main(String[] args) {

    }
}
