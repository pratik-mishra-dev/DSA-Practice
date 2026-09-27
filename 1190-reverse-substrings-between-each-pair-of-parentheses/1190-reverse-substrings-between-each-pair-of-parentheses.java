class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();

        for(char c:s.toCharArray()){
            
            if(c!=')'){
                st.push(c);
            }
            else{
                StringBuilder temp=new StringBuilder();

                while(st.peek()!='('){
                    temp.append(st.pop());
                }

                st.pop();

                for(int i=0;i<temp.length();i++){
                    st.add(temp.charAt(i));
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
             ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}