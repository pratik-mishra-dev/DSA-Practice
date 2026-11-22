class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{'|| c=='['){
                st.push(c);
            }
            else{
                if(st.size()==0) return false;
                char p=st.pop();
                if(c==')' && p!='(') return false;
                if(c=='}' && p!='{') return false;
                if(c==']' && p!='[') return false;
            }
        }
        return st.size()==0;
    }
}