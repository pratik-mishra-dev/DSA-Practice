class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character>st=new Stack<>();

        for(int i=0;i<n;i++){
            char c=num.charAt(i);
            while(st.size()>0 && st.peek()>c&& k>0){
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k>0){
            st.pop();
            k--;
        }
        

         String s ="";

        while (!st.isEmpty()) {
            s=st.pop()+s;
        }
        int i=0;
        while(i<s.length() && s.charAt(i)=='0')
        i++;

        if (i == s.length()) {
            return "0";
        }

        return s.substring(i);

        
    }
}