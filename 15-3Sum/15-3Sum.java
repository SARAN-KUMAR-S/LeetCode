// Last updated: 6/20/2026, 11:50:08 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> list = new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i = 0 ;i<nums.length-2 ; i++){
6            
7            int j = i+1;
8            int k = nums.length-1;
9            //System.out.print(i+" "+j+" "+k);
10            while( (i==0 ||(i!=0 && nums[i]!=nums[i-1])) && j<k ){
11                if(nums[i]+nums[j]+nums[k]<0){
12                    j++;
13                }
14                else if(nums[i]+nums[j]+nums[k]>0){
15                    k--;
16                }
17                else{
18                    ArrayList<Integer> ls = new ArrayList<>();
19                  
20                  
21                    ls.add(nums[i]);
22                    ls.add(nums[j]);
23                    ls.add(nums[k]);
24                    if(list.isEmpty()){
25                      list.add(ls);
26                    }
27                    else if(list.get(list.size()-1).equals(ls)==false){
28                        list.add(ls);
29                    }                      
30                    j++;
31                    k--;
32
33                }
34            }
35        }
36        return list;
37        
38    }
39}