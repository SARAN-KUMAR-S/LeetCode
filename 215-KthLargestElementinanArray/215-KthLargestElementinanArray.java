// Last updated: 6/10/2026, 5:30:32 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4        for(int i = 0 ; i<nums.length ; i++){
5            pq.add(nums[i]);
6        }
7        for(int j = 0 ; j<nums.length-k ; j++){
8            pq.poll();
9        }
10        return pq.peek();
11    }
12}