class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            int prev = (level % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            
            while (size-- > 0) {
                TreeNode curr = q.remove();
                // Even level
                if (level % 2 == 0) {
                    if (curr.val % 2 == 0 || curr.val <= prev)
                        return false;
                }
                // Odd level
                else {
                    if (curr.val % 2 == 1 || curr.val >= prev)
                        return false;
                }

                prev = curr.val;

                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null)
                    q.add(curr.right);
            }

            level++;
        }
        return true;
    }
}