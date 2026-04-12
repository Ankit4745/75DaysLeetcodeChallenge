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
    public void reorderList(ListNode head) {
        if(head == null  || head.next == null){
            return ;
        }
        ListNode l1=head;
        ListNode l2;
        ListNode s = head;
        ListNode f= head;
        while (f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        l2 = s.next;
        s.next = null;
        ListNode cur = l2;
        ListNode p = null;
        ListNode next;
        while(cur != null){
            next = cur.next;
            cur.next = p;
            p= cur;
            cur = next;
        }
        l2 = p;
        ListNode n ;
        ListNode pp;
        while(l2 != null){
            n = l1.next;
            pp = l2.next;
            l1.next = l2;
            l2.next =n;
            l2 =pp;
            l1 = l1.next.next;
        }
        head = l1;
    }
}