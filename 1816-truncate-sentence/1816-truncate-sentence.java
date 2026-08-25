class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int space = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                space++;
                if (space == k) {
                    break;
                }
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}