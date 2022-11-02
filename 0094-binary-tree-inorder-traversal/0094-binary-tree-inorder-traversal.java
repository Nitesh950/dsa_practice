/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private class Pair{
		TreeNode node;
		int state;
		
		Pair(TreeNode node, int state){
			this.node = node;
			this.state = state;
		}
	}
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<Integer>();
        List<Integer> in = new ArrayList<>();
        Stack<Pair> stack = new Stack();
		Pair pair = new Pair(root, 0);
		stack.push(pair);
		
		while(!stack.isEmpty()) {
			Pair top = stack.peek();
			if(top.state == 0) {
                
				if(top.node.left != null) {
					Pair lp = new Pair(top.node.left, 0);
					stack.push(lp);
				}
				top.state++;
			}
			else if(top.state == 1) {
                in.add(top.node.val);
				if(top.node.right != null) {
					Pair rp = new Pair(top.node.right, 0);
					stack.push(rp);
				}
				
				top.state++;
			}
			else {
				stack.pop();	
			}
		}
        return in;
        
    }
    
}