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
    
    public int height (TreeNode root){
        if(root==null)return -1;
        int l = height(root.left);
        int r = height(root.right);
        
        return Math.max(l,r)+1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int f = height(root.left)+height(root.right)+2;
        int dia = Math.max(f,Math.max(ld,rd));
        return dia;
    }
}