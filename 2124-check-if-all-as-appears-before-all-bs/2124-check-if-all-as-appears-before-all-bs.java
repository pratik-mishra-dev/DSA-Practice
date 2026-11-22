class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        int i=0;

        while(i<n){
            if(s.charAt(i)=='b') break;
            i++;
        }
        
        if(i==n) return true;

        while(i<n){
            if(s.charAt(i)=='a') break;
            i++;
        }
        if(i==n) return true;

        return false;

    }
}