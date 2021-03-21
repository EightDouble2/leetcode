//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 
// 👍 1602 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 创建目标链表以及遍历指针
        ListNode head = new ListNode();
        ListNode curr = head;

        // 遍历循环直至两个链表有一个完成
        while (l1 != null && l2 != null) {
            // 比较两个链表头节点的值，将小的节点插入目标节点尾部
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            }
            else {
                curr.next = l2;
                l2 = l2.next;
            }
            // 指针移到插入的节点
            curr = curr.next;
        }

        // 将没有完成遍历的节点插入到目标节点尾部
        curr.next = l1 != null ? l1 : l2;

        // 因为目标节点头节点为空，所以头节点的下一节点开始才为目标链表
        return head.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
