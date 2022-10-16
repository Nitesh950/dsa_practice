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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = slow;
        while(fast!=null && fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode secondHead = reverse(slow);
        temp.next = null;
        
        ListNode newHead = head;
        merge(newHead, secondHead);
        
    }
    public void merge(ListNode firstHead, ListNode secondHead){
        while(firstHead!=null && secondHead!=null){
            ListNode first = firstHead.next;
            ListNode second = secondHead.next;
            
            firstHead.next = secondHead;
            if(first==null) break;
            secondHead.next = first;
            firstHead = first;
            secondHead = second;
            
            
            //////
//             ListNode first = firstHead.next;
// 	            ListNode second = secondHead.next;
	            
// 	            firstHead.next = secondHead;
// 	            if(firstNext==null) break;
// 	            secondHead.next = first;
	            
// 	            firstHead = first;
// 	            secondHead = second;
        }
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}