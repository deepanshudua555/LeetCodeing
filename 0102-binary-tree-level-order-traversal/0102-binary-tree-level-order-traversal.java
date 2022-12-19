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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList= new ArrayList<>();
        if(root==null){
            return wrapList;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int lvlNum = queue.size();
            List<Integer>sublist = new ArrayList<>();
            for(int i=0; i<lvlNum; i++){
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                sublist.add(queue.poll().val);
            }
            wrapList.add(sublist);
        }
        return wrapList;
    }
}