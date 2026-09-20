class Solution {
    public boolean canConstruct(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        int[] freq1=new int[26];
        int[] freq2=new int[26];

        for(int i=0;i<m;i++){
            char c=s2.charAt(i);
            freq2[c-'a']++;
        }
        
        for(int i=0;i<n;i++){
            char c=s1.charAt(i);
            freq1[c-'a']++;
             if(freq1[c-'a']>freq2[c-'a']) return false;
        }
        return true;
    }
}