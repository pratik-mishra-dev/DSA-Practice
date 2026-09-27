class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=')'){
                st.push(c);
            }
            else{
                String temp="";
                while(st.peek()!='('){
                    temp+=st.pop();
                }

                st.pop();

                for(char ch:temp.toCharArray()){
                    st.push(ch);
                }
            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}