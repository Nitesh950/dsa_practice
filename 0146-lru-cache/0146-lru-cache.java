class LRUCache {
    class Node{//DLL 
        int key;
        int value;

        Node prev;
        Node next;

        Node(int key, int value){
            this.key= key;
            this.value= value;
        }
    }

    public Node[] map;//stores each node metatdata reff w.r.t to key
    public int count, capacity;
    public Node head, tail;
    
    public LRUCache(int capacity) { //all nodes are inserded b/w head and tail node 
        
        this.capacity= capacity;
        count= 0;
        
        map= new Node[10_000+1];//no of nodes //metadata w.r.t. to key 
        
        head= new Node(0,0);
        tail= new Node(0,0);
        
        head.next= tail;
        tail.prev= head;
        
        head.prev= null;
        tail.next= null;
    }
    
    public void deleteNode(Node node){ // deleting the node in LRU cache 
        node.prev.next= node.next;
        node.next.prev= node.prev;       
        
        return;
    }
    
    public void addToHead(Node node){// adding the node in front of head i.e;in LRU cache 
        node.next= head.next;
        node.next.prev= node;
        node.prev= head;
        
        head.next= node;      
        
        return;
    }
    
    public int get(int key) { // O(1)
        
        if( map[key] != null ){ //if node is present in LRU cache 
            
            Node node= map[key];//getting the node metadata 
            
            int nodeVal= node.value;
            
            deleteNode(node);//deleting the node from dll //O(1)
            
            addToHead(node);//adding to the front of head //now visited //O(1)
            
            return nodeVal;//returning the value of the node w.r.t to key 
        }
        else
            return -1;//node not present 
    }
    
    public void put(int key, int value) { // O(1)
        
        if(map[key] != null){//node already exists in LRU cache 
            
            Node node= map[key]; //getting the node metadata
            
            node.value= value;//changing the node value to the current value 
            
            deleteNode(node);//deleting the node  //O(1)
            
            addToHead(node);//adding node in front of head  //O(1)
            
        } else {//node dosent  exists in LRU cache 
            
            Node node= new Node(key,value);
            
            map[key]= node;
            
            if(count < capacity){ //Case 1 //space availabe 
                count++;
                addToHead(node);
            } 
            else {//case 2 //space not availabe (capacity full)
                
                //deleting the least recently used node, making 1 sapce availabele
                map[tail.prev.key]= null;
                deleteNode(tail.prev);
                
                //adding the node in front of head
                addToHead(node);
            }
        }
        
        return;
    }
    
}