class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int count=0;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(') st.push(c);
            else if(c==')') st.pop();
            count=Math.max(count,st.size());
        }
        return count;
    }
}