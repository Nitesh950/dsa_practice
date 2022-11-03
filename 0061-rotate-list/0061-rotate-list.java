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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null){
            return head;
        }
        int size = findSize(head);
        k = k%size;
        if(k==0){
            return head;
        }
        int i=1;
        ListNode prev = null;
        ListNode temp = head;
        while(i< (size-k+1)){
            prev = temp;
            temp = temp.next;
            i++;
        }
        ListNode newHead = temp;
        ListNode newLast = prev;
        newLast.next = null;
        
        i=1;
        while(i<k){
            temp = temp.next;
            i++;
        }
        temp.next = head;
        return newHead;
    }
    public int findSize(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }
   
}