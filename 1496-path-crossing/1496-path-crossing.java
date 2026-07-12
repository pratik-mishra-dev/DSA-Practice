class Solution {
    public boolean isPathCrossing(String path) {
        int n=path.length();
        HashSet<String>set=new HashSet<>();
        set.add("0,0");
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            char c=path.charAt(i);

            if(c=='N') x++;
            else if(c=='S') x--;
            else if(c=='E') y++;
            else y--;

            String s=x+","+y;
            if(set.contains(s)) return true;

            set.add(s);


        }
        return false;
    }
}