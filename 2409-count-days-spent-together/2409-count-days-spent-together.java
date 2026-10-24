class Solution {
    public int day(String s){
        int mon=Integer.parseInt(s.substring(0,2));
        int day=Integer.parseInt(s.substring(3,5));
        int total=day;

        int[] arr={0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=1;i<mon;i++){
            total+=arr[i];
        }

        return total;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a1=day(arriveAlice);
        int a2=day(leaveAlice);
        int b1=day(arriveBob);
        int b2=day(leaveBob);

        int start=Math.max(a1,b1);
        int end=Math.min(a2,b2);

        if(start>end) return 0;

        return end-start+1;
    }
}