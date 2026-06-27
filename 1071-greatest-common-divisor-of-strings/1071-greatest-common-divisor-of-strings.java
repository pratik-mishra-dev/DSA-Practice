class Solution {
    public int gcd(int a,int b){
        int i=2;
        int ans=1;
        while(i<=b){
            if(a%i==0 && b%i==0) ans=i;
            i++;
        }
        return ans;
    }
    public String gcdOfStrings(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
       if(!(str1+str2).equals(str2+str1)) return "";
       int len=gcd(str1.length(),str2.length());
       return str1.substring(0,len);
    }
}