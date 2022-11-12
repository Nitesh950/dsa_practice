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
    public int sumNumbers(TreeNode root) {
        return rootToLeaf(root, 0);
    }
    public int rootToLeaf(TreeNode root, int asf){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            asf += root.val;
            return asf;
        }
        asf = (asf + root.val) * 10;
        int leftSum = rootToLeaf(root.left, asf);
        int rightSum = rootToLeaf(root.right, asf);

        return leftSum + rightSum;
    }
    
}