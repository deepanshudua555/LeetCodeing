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
//  */
// class Solution {
//     public int maxDepth(TreeNode root) {
//     if (root == null) {
//       return 0;
//     }
//     Queue queue = new LinkedList<>();
//     queue.add(root);
//     queue.add(null);
//     int level = 1;
//     while (!queue.isEmpty()) {
//       TreeNode curr = queue.poll();
//       if (curr == null) {
//         if (queue.isEmpty()) {
//           break;
//         }
//         level++;
//         queue.add(curr);
//       } else {
//         if (curr.left != null) {
//           queue.add(curr.left);
//         }
//         if (curr.right != null) {
//           queue.add(curr.right);
//         }
//       }
//     }
//     return level;
//   }
// }




class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        q.offer(null);
        int count = 1;
        int max = 1;
        while(!q.isEmpty()) {
            TreeNode tmp = q.poll();
            
            if(tmp!=null) {
                if(tmp.left == null && tmp.right == null) {
                    if(max < count) {
                        max = count;
                    }
                    
                }
                if(tmp.left != null) q.offer(tmp.left);
                if(tmp.right != null) q.add(tmp.right);
            }
            else {
                if(!q.isEmpty()) {
                    count++;
                    q.offer(null);
                }
            }
            
        }
        
        return max;        
    }
}