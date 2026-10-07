class Solution {
    Set<String> ans = new HashSet<>();
    public void dfs(String s, int index, int leftRemove,
                    int rightRemove, int balance, String cur) {

        if (index == s.length()) {
            if (leftRemove == 0 && rightRemove == 0 && balance == 0) {
                ans.add(cur);
            }
            return;
        }

        char ch = s.charAt(index);

        if (ch == '(') {
            // Remove '('
            if (leftRemove > 0) {
                dfs(s, index + 1, leftRemove - 1,
                    rightRemove, balance, cur);
            }

            // Keep '('
            dfs(s, index + 1, leftRemove,
                rightRemove, balance + 1, cur + ch);
        }
         else if (ch == ')') {
            // Remove ')'
            if (rightRemove > 0) {
                dfs(s, index + 1, leftRemove,
                    rightRemove - 1, balance, cur);
            }

            // Keep ')' only if it has a matching '('
            if (balance > 0) {
                dfs(s, index + 1, leftRemove,
                    rightRemove, balance - 1, cur + ch);
            }

        } else {
            // Normal character
            dfs(s, index + 1, leftRemove,
                rightRemove, balance, cur + ch);
        }
    }

    public List<String> removeInvalidParentheses(String s) {

        int leftRemove = 0;
        int rightRemove = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                leftRemove++;
            }
            else if (ch == ')') {
                if (leftRemove > 0) {
                    leftRemove--;
                } else {
                    rightRemove++;
                }
            }
        }

        dfs(s, 0, leftRemove, rightRemove, 0, "");

        return new ArrayList<>(ans);
    }
}