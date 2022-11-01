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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                // System.out.println(l1.val);
                // System.out.println(l2.val);
        ListNode head1 = reverse(l1);
        ListNode head2 = reverse(l2);
        // System.out.println(head1.next.val);
        //         System.out.println(head2.next.val);
        ListNode res = new ListNode(0);
        ListNode head = res;
        int carry = 0;
        while(head1!=null || head2!=null || carry!=0){
            int x = (head1!=null)? head1.val : 0;
            int y = (head2!=null)? head2.val : 0;
            int sum= x+y+carry;
            carry = sum/10;
            head.next = new ListNode(sum%10);
            head = head.next;
            
            
            if(head1!=null) head1 = head1.next;
            if(head2!=null) head2 = head2.next;
        }
        head = reverse(res.next);
        return head;
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