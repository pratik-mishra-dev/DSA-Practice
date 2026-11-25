class Solution {
    public String removeDuplicates(String s) {
        String ans="";
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(st.size()>0 && st.peek()==c){
                while(st.size()>0 && st.peek()==c) st.pop();
            }
            else st.push(c);
        }

         while(st.size()>0) ans=st.pop()+ans;

         return ans;

    }
}