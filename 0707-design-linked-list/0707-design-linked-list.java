class MyLinkedList {
    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    
    Node head;
    int size;
    
    public MyLinkedList() {
        this.head=null;
        this.size = 0;
    }
    
    public int get(int index) {
        if(index>=size){
            return -1;
        }
        if(index==0){
            return head.val;
        }else{
            int i=0;
        Node temp = head;
        while(i<index){
            temp = temp.next;
            i++;
        }
        return temp.val;
            
        }
        
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(head==null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            addAtHead(val);
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            Node node = new Node(val);
            temp.next = node;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
        }else if(index==size){
            addAtTail(val);
        }else{
            int i=0;
            Node temp = head;
            while(i<index-1){
                temp = temp.next;
                i++;
            }
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size){
            return;
        }
        if(index==0){
            head = head.next;
            size--;
        }else{
            int i=0;
            Node temp = head;
            while(i<index-1){
                temp = temp.next;
                i++;
            }
            
            temp.next=temp.next.next;
            size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */