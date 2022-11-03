class LRUCache {
    Node head = new Node();
    Node tail = new Node();
    HashMap<Integer, Node> maps;
    int capacity;
    
    public LRUCache(int capacity) {
        maps = new HashMap<>(capacity);
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        int result = -1;
        Node node = maps.get(key);
        if(node != null){
            result = node.val;
            remove(node);
            add(node);
        }
        return result;
    }
    
    public void put(int key, int value) {
        if(maps.containsKey(key)){
            Node node = maps.get(key);
            remove(node);
            node.val = value;
            add(node);
        }
        else{
            if(capacity == maps.size()){
                maps.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node node = new Node();
            node.key = key;
            node.val = value;
            maps.put(key, node);
            add(node);
        }
    }
    
    public void add(Node node){
        Node nextNode = head.next;
        head.next = node;
        node.prev = head;
        
        node.next = nextNode;
        nextNode.prev = node;
    }
    public void remove(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */