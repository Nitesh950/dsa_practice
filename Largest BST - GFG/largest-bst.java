//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the curr node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the curr node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the curr node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            System.out.println(T.largestBst(root));
            
            t--;
        }
    }
}


// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        BST ans = findBST(root);
        return ans.size;
        
    }
    private static class BST{
        boolean isBST;
        int max;
        int min;
        int size;
    }
    
     static BST findBST(Node root){
        if(root == null){
            BST base = new BST();
            base.isBST = true;
            base.max = Integer.MIN_VALUE;
            base.min = Integer.MAX_VALUE;
            base.size = 0;
            
            return base;
        }
        BST lbst = findBST(root.left);
        BST rbst = findBST(root.right);
        
        BST ansTree = new BST();
        
        ansTree.isBST = lbst.isBST && rbst.isBST && (root.data > lbst.max && root.data < rbst.min);
        ansTree.max = Math.max(root.data, Math.max(lbst.max, rbst.max));
        ansTree.min = Math.min(root.data, Math.min(lbst.min, rbst.min));
        
        if(ansTree.isBST){
            ansTree.size = lbst.size + rbst.size + 1;
        }
        else if(lbst.size > rbst.size){
            ansTree.size = lbst.size;
        }
        else{
            ansTree.size = rbst.size;
        }
        
        return ansTree;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}