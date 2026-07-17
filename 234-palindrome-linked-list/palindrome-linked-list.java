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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head; ListNode fast =head;
        ListNode prev= slow;
        while(fast!=null && fast.next !=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode start=null;
        ListNode next=null;
        while(slow!=null){
            next=slow.next;
            slow.next=start;
            start=slow;
            slow=next;
        }
        while (start != null && head != null ) {
            if (head.val != start.val)
                return false;

            head = head.next;
            start = start.next;
        }
        return true;
        
    }
}