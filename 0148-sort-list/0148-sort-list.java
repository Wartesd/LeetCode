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
    public ListNode sortList(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode sorted = new ListNode(0);
        ListNode current = sorted;

        while (head != null){
            values.add(head.val);
            head = head.next;
        }

        values.sort((a,b) -> Integer.compare(a,b));

        for (int value : values){
            current.next = new ListNode(value);
            current = current.next;
        } 
        
        return sorted.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna