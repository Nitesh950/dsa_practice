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
    public int diameterOfBinaryTree(TreeNode root) {
        DiameterAndHeight ans = diameter(root);
        return ans.dia;
    }
    private class DiameterAndHeight{
        int dia;
        int height;
    }
    public DiameterAndHeight diameter(TreeNode root){
        if(root==null){
            DiameterAndHeight bp = new DiameterAndHeight();
            bp.height = -1;
            bp.dia = 0;
            return bp;
        }
        DiameterAndHeight lp = diameter(root.left);
        DiameterAndHeight rp = diameter(root.right);

        DiameterAndHeight dAndH = new DiameterAndHeight();
        dAndH.height = Math.max(lp.height, rp.height) + 1;
        int fact = lp.height + rp.height + 2;
        dAndH.dia = Math.max(fact, Math.max(lp.dia, rp.dia));

        return dAndH;

    }
}