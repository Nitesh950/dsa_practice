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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode tail = head;
        int size = 1;
        while(tail.next!=null){
            prev = tail;
            tail = tail.next;
            size++;
        }
        if(n==1) {
            if(size==1){
                return head.next;
            }
            prev.next = null;
            return head;
        }
        if(n==size){
            head = head.next;
            return head;
        }
        int count = 1;
        ListNode node = head;
        while(count< (size-n+1)-1)
        {
            node = node.next;
            count++;
        }
        node.next = node.next.next;
        //find size of the list
        //delete (size-n+1)th node
         return head;
    }
   
}