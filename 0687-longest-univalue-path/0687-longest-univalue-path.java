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
    int ans=0;
    private int dfs(TreeNode root){
         if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        int left_path=0;
        int right_path=0;
        if(root.left!=null && root.left.val==root.val) left_path=left+1;
        if(root.right!=null && root.right.val==root.val) right_path=right+1;

                ans=Math.max(ans,left_path+right_path);
            return Math.max(left_path,right_path);
    }
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        dfs(root);
        return ans;    
    }
}