class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        int count=0;

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                count=Math.max(count,st.size());
                st.pop();
            }
            
        }
        return count;
    }
}