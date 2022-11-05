/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        nodeToRoot = new ArrayList<>();
        findNode(root, target.val);
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nodeToRoot.size();i++){
            List<Integer> ans = new ArrayList<>();
            ans = path(nodeToRoot.get(i), k-i, i==0?null:nodeToRoot.get(i-1));
            for(Integer j : ans){
                res.add(j);
            }
        }
        return res;
        
    }
    public List<Integer> path(TreeNode root, int k, TreeNode blocker){
        if(root == null || k<0 || root==blocker){
            return new ArrayList<>();
        }
        if(k==0){
            List<Integer> base = new ArrayList<>();
            base.add(root.val);
            return base;
        }
        List<Integer> ans = new ArrayList<>();
        List<Integer> lc = path(root.left, k-1, blocker);
        List<Integer> rc = path(root.right, k-1, blocker);

        for(Integer data: lc){
            ans.add(data);
        }
        for(Integer data: rc){
            ans.add(data);
        }

        return ans;
    }


    ArrayList<TreeNode> nodeToRoot;
    public boolean findNode(TreeNode root, int target){
        if(root == null){
            return false;
        }
        if(root.val == target){
            nodeToRoot.add(root);
            return true;
        }
        boolean lc = findNode(root.left, target);
        if(lc){
            nodeToRoot.add(root);
            return true;
        }

        boolean rc = findNode(root.right, target);
        if(rc){
            nodeToRoot.add(root);
            return true;
        }

        return false;
    }
}