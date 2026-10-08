class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int open=0;
        String ans="";
        int i=0;
        int j=0;
        while(j<n){
            if(s.charAt(j)=='(') open++;
            else{
                open--;
                if(open==0){
                    i++;
                    ans+=s.substring(i,j);
                    i=j+1;
                }
            }
            j++;
        }
        return ans;
    }
}