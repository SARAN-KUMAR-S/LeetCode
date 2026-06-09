// Last updated: 6/9/2026, 10:06:34 PM
1class Solution {
2    public boolean carPooling(int[][] trips, int capacity) {
3        int n = trips.length;
4        int t =0;
5        for(int m=0 ; m<n ; m++){
6            if(trips[m][2]>t){
7                t=trips[m][2];
8            }
9        }
10        int arr[] =new int[t];
11        for(int i = 0 ;i<trips.length ; i++){
12            for(int j = trips[i][1]; j<trips[i][2]; j++){
13                arr[j]+=trips[i][0];
14            }
15        }
16        for(int k :arr){
17            if(k>capacity){
18                return false;
19            }
20        }
21        return true;
22        
23    }
24}