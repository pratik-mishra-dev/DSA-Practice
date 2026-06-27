class Solution {
    public int reverse(int x) {
        if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE) return 0;
        int sign=0;
        if(x<0){
            sign=1;
            x=x*-1;
        }
        long reverse=0;
        while(x>0){
            reverse=reverse*10+x%10;
             
            x/=10;
        }
        if(reverse>Integer.MAX_VALUE||reverse<Integer.MIN_VALUE) return 0;
        if(sign==1) return (int)(-1*reverse);
        return (int)reverse;
    }
}