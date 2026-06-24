class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n=x;
        int Palindrome=0;
        while(n>0){
            Palindrome=Palindrome*10+n%10;
            n/=10;
        }
        return Palindrome==x;
    }
}