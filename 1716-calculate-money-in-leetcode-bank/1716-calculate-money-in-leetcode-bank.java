class Solution {
    public int totalMoney(int n) {
        int count=0;

        int current_money=1;
        int x=2;
        int curr_day=0;
        while(curr_day!=n){
            count+=current_money;
            curr_day++;
            if(curr_day%7==0){
                current_money=x++;
            }
            else{
                current_money++;
            }
            
        }
        return count;
    }
}