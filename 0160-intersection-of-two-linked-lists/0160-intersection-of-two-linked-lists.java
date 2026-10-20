/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode node = headA;
        while(node != null) {
            hs.add(node);
            node = node.next;
        }

        node = headB;
        while(node != null) {
            if(hs.contains(node)) return node;
            node = node.next;
        }

        return null;
    }
}