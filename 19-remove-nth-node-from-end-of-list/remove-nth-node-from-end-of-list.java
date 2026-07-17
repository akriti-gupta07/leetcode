class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }

        int len;
        if (fast == null) {      // Even length
            len = 2 * count;
        } else {                 // Odd length
            len = 2 * count + 1;
        }

        // Remove first node
        if (n == len) {
            return head.next;
        }

        int node = len - n;
        ListNode start = head;

        for (int i = 1; i < node; i++) {
            start = start.next;
        }

        start.next = start.next.next;

        return head;
    }
}