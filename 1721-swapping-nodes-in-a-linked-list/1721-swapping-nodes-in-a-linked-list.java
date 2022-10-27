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
    public ListNode swapNodes(ListNode head, int k) {
        int n = size(head);
        //first swap node 
        ListNode temp = head;
        int count = 1;
        
        while(count!=k){
            temp = temp.next;
            count++; 
        }
        
        ListNode fsn = temp;
        
        temp = head;
        count = 1;
        
        while(count!=(n-k+1)){
            temp = temp.next;
            count++;
        }
        
        ListNode ssn = temp;
    int fval = fsn.val;
        fsn.val = ssn.val;
        ssn.val = fval;
        
        return head;
    }
    
    public int size(ListNode head){
        ListNode temp = head;
        int size = 0;
        
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }
}