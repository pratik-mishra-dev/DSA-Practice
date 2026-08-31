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
    public boolean isEvenOddTree(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int level = 0;

        while (q.size() > 0) {
            int size = q.size();

            int x = (level % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            TreeNode tempTop = q.remove();

            if (level == 0) {
                if (tempTop.val % 2 == 0)
                    return false;
            }

            if (tempTop.left != null)
                q.add(tempTop.left);
            if (tempTop.right != null)
                q.add(tempTop.right);

            if (level % 2 == 0) {
                 if (tempTop.val % 2 == 0)
                    return false;
                if (tempTop.val <= x) 
                    return false;

                x = tempTop.val; 

                size--;

                while (size > 0) {
                    TreeNode temp = q.remove();

                    if (temp.val % 2 == 0)
                        return false;

                    if (temp.val <= x)
                        return false;

                    x = temp.val;

                    if (temp.left != null)
                        q.add(temp.left);
                    if (temp.right != null)
                        q.add(temp.right);

                    size--;
                }
            }

            else if (level % 2 == 1) {
                if (tempTop.val % 2 == 1) 
                    return false;

                if (tempTop.val >= x)
                    return false;

                x = tempTop.val;

                size--;

                while (size > 0) {
                    TreeNode temp = q.remove();

                    if (temp.val % 2 == 1)
                        return false;

                    if (temp.val >= x)
                        return false;

                    x = temp.val;

                    if (temp.left != null)
                        q.add(temp.left);
                    if (temp.right != null)
                        q.add(temp.right);

                    size--;
                }
            }
            level++;
        }
        return true;
    }
}