class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<piles.length ; i++){
            sum+=piles[i];
            max = Math.max(piles[i] , max);
        }
        if(piles.length==h)return max; 
        int x = max;
        int ans=0;
        while(x<max){
            int res =0;
        for(int i = 0 ; i<piles.length ; i++){
            res+=Math.ceil(piles[i]/x);
        }
        x--;
        if(res<=h){
            ans = res;
            return ans;
        }
        }
        return ans;
    }
}