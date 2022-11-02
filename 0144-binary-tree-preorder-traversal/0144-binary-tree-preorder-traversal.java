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
    ArrayList<Integer> in = new ArrayList<Integer>();
	public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
        	return new ArrayList<>();
        }
        in.add(root.val);
        List<Integer> left = preorderTraversal(root.left);
        // in.add(root.val);
        List<Integer> right = preorderTraversal(root.right);
        
        return in;
    }
}