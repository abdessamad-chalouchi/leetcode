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
    public int maxHeight(TreeNode root){
        TreeNode node;
        int res = 0;
        if (root == null) return 0;
        res = 1+Math.max(maxHeight(root.left), maxHeight(root.right));
        return res;
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root == null) return null;
        if (root.right == null && root.left == null){
            return root;
        }
        int right = maxHeight(root.right);
        int left =  maxHeight(root.left);

        if(right == left){
            return root;
        }else if(right > left){
            return lcaDeepestLeaves(root.right);
        }else{
            return lcaDeepestLeaves(root.left);
        }
    }
}