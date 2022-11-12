/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length = findLength(head);
        if(length == -1) return null;

        ListNode first = head;
        ListNode second = head;

        while(length>0){
            second = second.next;
            length--;
        }
        while(first!=second){
            first = first.next;
            second = second.next;
        }

        return first;
    }
    public int findLength(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
            int length = 0;
            if(slow == fast){
                do{
                    length++;
                    slow = slow.next;
                }while(slow!=fast);

                return length;
            }
        }
        return -1;
    }
}