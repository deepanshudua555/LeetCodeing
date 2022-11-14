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
    public int get_count(Integer[] list){
       int swaps = 0;
        Integer[] sorted = new Integer[list.length];
        for(int i=0; i<sorted.length; i++) sorted[i] = list[i];
        Arrays.sort(sorted);
        Integer[] ind = new Integer[100100];
        for(int i=0; i<list.length; i++) ind[list[i]] = i;
        
        for(int i=0; i<list.length; i++) {
            if(list[i] != sorted[i]) {
                swaps++;
                ind[list[i]]= ind[sorted[i]];
                list[ind[sorted[i]]]=list[i];
            }
        }
        return swaps;
    }
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int ans = 0;
        while(q.size()>0){
            int len = q.size();
            Integer[] arr = new Integer[len];
            for(int i=0;i<len;i++){
                TreeNode curr = q.poll();
                arr[i]=curr.val;
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            ans+=get_count(arr);
        }
        return ans;
    }
}