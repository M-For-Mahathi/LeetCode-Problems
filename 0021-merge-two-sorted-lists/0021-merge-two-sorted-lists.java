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
        ListNode p = new ListNode(0);
        ListNode q = p;

        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                q.next = l1;
                l1 = l1.next;
            }else{
                q.next = l2;
                l2 = l2.next;
            }
            q = q.next;
        }

        if(l1 != null) q.next = l1;
        else q.next = l2;

        return p.next;
    }
}