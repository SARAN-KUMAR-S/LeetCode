class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ind = 1;
        int sum=0;
        for(int i = cost.length-1; i>=0 ; i--){
            if(ind%3!=0){
                sum+=cost[i];
            }
            ind++;
        }
        return sum;
    }
}
