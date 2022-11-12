/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head!=null) recflatten(head);
        return head;
    }
    public Node recflatten(Node head){
        Node curr = head;
        Node nextNode = head;
        Node tail = head;
        while(curr != null){
            nextNode = curr.next;
            if(curr.child != null){
                tail = recflatten(curr.child);
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
                
                tail.next = nextNode;
                if(nextNode != null){
                    nextNode.prev = tail;
                }
                curr = tail;
            }
            else{
                curr = curr.next;
            }
            if(curr != null){
                tail = curr;
            }
        }
        return tail;
    }
}