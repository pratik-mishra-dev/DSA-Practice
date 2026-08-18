class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            String a="";
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                a+=c;
                 String b=new StringBuilder(a).reverse().toString();
                if (a.equals(b)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}