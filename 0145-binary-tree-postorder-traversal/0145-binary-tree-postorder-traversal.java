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
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> l=new ArrayList<>();
        Deque<TreeNode> st=new ArrayDeque<>();
        if(root!=null) st.push(root);
        while(st.size()>0){
            TreeNode t=st.pop();
            l.add(t.val);           
            if(t.left!=null) st.push(t.left);
            if(t.right!=null) st.push(t.right);
        }
        Collections.reverse(l);
         return l;
    }
}