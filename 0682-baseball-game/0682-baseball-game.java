class Solution {
    public int calPoints(String[] s) {

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<s.length;i++){
            String c=s[i];
            if(c.equals("D") && st.size()>0){
                int x=st.peek();
                x=x*2;
                
                st.push(x);
            }
            else if(c.equals("C") && st.size()>0){
                st.pop();
            }
            else if(c.equals("+") && st.size()>1){
                int x=st.pop();
                int y=st.peek()+x;

                st.push(x);
                st.push(y);
            }
            else if(!c.equals("+") && !c.equals("D") && !c.equals("C")){
                int x=Integer.parseInt(c);
                st.push(x);
            }

        }
        int ans=0;
        while(st.size()>0){
            ans+=st.pop();
        }
        return ans;
    }
}