class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            StringBuilder a=new StringBuilder();
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                a.append(c);
                 StringBuilder b=new StringBuilder(a).reverse();
                if (a.toString().equals(b.toString())) {
                    ans++;
                }
            }
        }
        return ans;
    }
}