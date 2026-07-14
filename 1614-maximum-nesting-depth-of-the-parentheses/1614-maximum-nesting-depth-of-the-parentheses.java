class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int count=0;
        //Stack<Character>st=new Stack<>();
        int a=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(') a++;
            else if(c==')') a--;
            count=Math.max(count,a);
        }
        return count;
    }
}