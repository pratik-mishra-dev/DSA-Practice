class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
         List<List<String>> ans=new ArrayList<>();

        int n=s1.length();
       int i=0;
        while(i<n){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(c1!=c2){
                String a="";
                String b="";
                List<String> l=new ArrayList<>();

                while(i<n && s1.charAt(i)!=s2.charAt(i)){
                    a+=s1.charAt(i);
                    b+=s2.charAt(i);
                    i++;
                }
                l.add(a);
                l.add(b);

                ans.add(l);

                
            }
            i++;
        }
        return ans;
    }
}