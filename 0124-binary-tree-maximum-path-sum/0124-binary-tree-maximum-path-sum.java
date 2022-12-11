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
    
    public int ans = -(int)1e9;
    
    public int helper(TreeNode root){
        if(root==null)return 0;
        
        int l = helper(root.left);
        l= (l<0)?0:l;
        int r = helper(root.right);
        r = (r<0)?0:r;
        ans = Math.max(ans, l+r+root.val);
        return Math.max(l,r)+root.val;
        
    }
    
    public int maxPathSum(TreeNode root) {
        
        helper(root);
        return ans;
    }
}