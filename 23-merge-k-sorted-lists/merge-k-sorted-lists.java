
import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for (ListNode l : lists) {
            if (l != null) {
                pq.offer(l);
            }
        }

        ListNode result = new ListNode(0);
        ListNode current = result;

        while (!pq.isEmpty()) {
            ListNode l = pq.poll();

            current.next = l;
            current = current.next;

            if (l.next != null) {
                pq.offer(l.next);
            }
        }

        return result.next;
    }
}
