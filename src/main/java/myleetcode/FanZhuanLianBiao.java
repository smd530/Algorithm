package myleetcode;

import basicdatastructure.ListNode;

/**
 * 反转链表 剑指 24
 *
 * @author shanmingda
 * @date 2020-10-30 17:26
 */
public class FanZhuanLianBiao {

    public ListNode reverseList(ListNode head) {

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
}
