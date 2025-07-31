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
    // solution 1 recursive
    /*
    * each time we check the right and left and get the max value berween theme plus 1 for first one it will goes to max left and right and when we will be on null will start adding and return to prevouis one
    */
    // public int maxDepth(TreeNode root) {
    //     if(root == null) return 0;    
    //     return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    // }
    // option 2 BFS
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root==null) return 0;
        q.add(root);
        int depth = 0;
        while(!q.isEmpty()){
            int levelSize = q.size();
            depth++;
            for(int i = 0;i<levelSize;i++){
                TreeNode curr = q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return depth;
    }
}