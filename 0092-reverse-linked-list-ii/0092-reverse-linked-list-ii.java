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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp1= head;
        int i = 1;
        ListNode nodeBeforeLeft = null;
        while(i<left){
            nodeBeforeLeft = temp1;
            temp1 = temp1.next;
            i++;
        }
        ListNode previousStart = temp1;
        
        temp1 = head;
        i=1;
        ListNode nodeAfterRight = head;
        while(i<=right){
            temp1 = nodeAfterRight;
            nodeAfterRight = nodeAfterRight.next;
            i++;
        }
        
        ListNode newStart = reverse(previousStart, nodeAfterRight);
        previousStart.next = nodeAfterRight;
        if(nodeBeforeLeft!=null){
            nodeBeforeLeft.next = newStart;
        }else{
            head = newStart;
        }
        return head;
        
    }
    
    public ListNode reverse(ListNode left, ListNode right){
        ListNode prev = null;
        while(left!=right){
            ListNode nextNode = left.next;
            left.next = prev;
            prev = left;
            left = nextNode;
        }
        return prev;
    }
}