class Solution {
    int max=0;
    public void helper(String s,int i,int open,int close,Set<String> set,String cur){
         if (close > open) return;

        if(i==s.length()){
           
            if(open==close ){
               if (cur.length() > max) {
                    set.clear();
                    max = cur.length();
                    set.add(cur);
                }
                else if (cur.length() == max) {
                    set.add(cur);
                }
            }
            return;
        }
        if(s.charAt(i)=='('){
            helper(s,i+1,open+1,close,set,cur+'(');
             helper(s,i+1,open,close,set,cur);
        }
        else if(s.charAt(i)==')'){
            helper(s,i+1,open,close+1,set,cur+')');
            helper(s,i+1,open,close,set,cur);
        }
        else helper(s,i+1,open,close,set,cur+s.charAt(i));
    }
    public List<String> removeInvalidParentheses(String s) {
        Set<String> set=new HashSet<>();
        helper(s,0,0,0,set,"");

        List<String> ans=new LinkedList<>(set);
        

        return ans;
    }
}