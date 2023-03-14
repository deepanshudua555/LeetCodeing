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
    
    public int find(TreeNode root ,int x){
        if(root==null)return 0;
        x =x*10+root.val;
      
       
        int l =find(root.left,x);
        int r =find(root.right,x);
         if(root.left==null && root.right==null )return x;
         return l+r;
    }
    
    public int sumNumbers(TreeNode root) {
        int x=0;
        return find(root,x);
    }
}