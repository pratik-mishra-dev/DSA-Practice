class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String s=""+x;
        StringBuilder sb=new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}