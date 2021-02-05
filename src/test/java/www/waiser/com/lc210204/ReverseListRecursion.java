package www.waiser.com.lc210204;

import org.junit.Test;
import www.waiser.com.lc210203.ListNode;

/**
 * <p>
 *反转链表递归
 * </p>
 *
 * @Author mengwei
 * @Date 2021/2/4
 */
public class ReverseListRecursion {

     @Test
     public ListNode reverseList(ListNode head) {
         if (head == null || head.next == null) {
             return head;
         }
         ListNode newHead = reverseList(head.next);
         head.next.next = head;
         head.next = null;
         return newHead;

     }
}
