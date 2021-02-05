package www.waiser.com.lc210203;

/**
 * <p>
 *
 * </p>
 *
 * @Author mengwei
 * @Date 2021/2/3
 */
public class ReverseList {

    class Solution {
            public ListNode reverseList(ListNode head) {
                ListNode pre = null;
                ListNode cur= head;
                while (cur != null) {
                    ListNode tmp = cur.next; // 暂存后继节点 cur.next
                    cur.next = pre;          // 修改 next 引用指向
                    pre = cur;               // pre 暂存 cur
                    cur = tmp;               // cur 访问下一节点

                }
                return pre;
            }


    }
}
