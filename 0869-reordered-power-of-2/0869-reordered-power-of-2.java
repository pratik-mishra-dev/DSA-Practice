class Solution {
    public boolean reorderedPowerOf2(int n) {
        String s=""+n;
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        s="";
        for(int i=0;i<ch.length;i++)
        s+=ch[i];

        int x=0;
        for(int j=1;j<=31;j++){
            int y=1<<x;

        String s1=""+y;
        char[] ch1=s1.toCharArray();
        Arrays.sort(ch1);
        s1="";
        for(int i=0;i<ch1.length;i++)
        s1+=ch1[i];

        if(s.equals(s1)) return true;

        x++;

        }
        return false;
    }
}