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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Stack<TreeNode>ms = new Stack<>();
        ms.push(root);
        Stack<TreeNode>cs = new Stack<>();
        int level = 1;
        TreeNode curr;
            List<Integer>ans = new ArrayList<>();

        while(ms.size()>0){

            curr = ms.pop();
            // System.out.print(curr.val);
            ans.add(curr.val);
            if(level%2==1){

                if(curr.left!=null)cs.push(curr.left);
                if(curr.right!=null)cs.push(curr.right);

            }
            else{
                if(curr.right!=null)cs.push(curr.right);
                if(curr.left!=null)cs.push(curr.left);
                
            }
            if(ms.size()==0){
                ms=cs;
                cs = new Stack<>();
                level++;
                res.add(ans);
                ans = new ArrayList<>();
            }
        }
        return res;
    }
}