class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> star=new Stack<>();
       
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') st.push(i);
            else if(c=='*') star.push(i);
            else {
                if(st.size()>0){
                    st.pop();
                }
                else if(star.size()>0){
                    star.pop();
                }
                else return false;  
            }
        }
        while(!st.isEmpty() && !star.isEmpty()){
            int open=st.pop();
            int wildcard=star.pop();
            if(open>wildcard){
                return false;
            }
            
        } 
        return st.isEmpty();
    }
}