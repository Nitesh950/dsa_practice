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
   public static ListNode deleteDuplicates(ListNode head) {
		HashMap<Integer, Integer> maps = new HashMap<>();
		ListNode temp = head;
		while (temp != null) {
			maps.put(temp.val, maps.getOrDefault(temp.val, 0) + 1);
			temp = temp.next;
		}
		temp = head;
		ListNode prev = null;
		while (temp != null) {
			if (maps.get(temp.val) > 1) {
                if(temp == head){
                    head = temp.next;
                    temp = temp.next;
                    continue;
                }
				delete(prev);
			} else {
				prev = temp;
				
			}
			temp = temp.next;
		}
		return head;
	}

	public static void delete(ListNode node) {
		node.next = node.next.next;
	}
}