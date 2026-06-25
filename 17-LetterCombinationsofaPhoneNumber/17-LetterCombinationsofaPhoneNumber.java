// Last updated: 6/25/2026, 11:27:05 PM
1class Solution {
2    HashMap<Character,String> ls= new HashMap<>();
3    List<String> ans = new ArrayList<>();
4    public List<String> letterCombinations(String digits) {
5        for(char i : digits.toCharArray()){
6            ls.put('2',"abc");
7            ls.put('3',"def");
8            ls.put('4',"ghi");
9            ls.put('5',"jkl");
10            ls.put('6',"mno");
11            ls.put('7',"pqrs");
12            ls.put('8',"tuv");
13            ls.put('9',"wxyz");
14        }
15        backtracking(digits,new StringBuilder() , 0);
16        return ans;
17    
18    }
19    public void backtracking(String digits,StringBuilder path , int i){
20        if(i==digits.length()){
21            ans.add(path.toString());
22            return;
23        }
24        String str = ls.get(digits.charAt(i));
25        for(char j : str.toCharArray()){
26            path.append(j);
27            backtracking(digits,path,i+1);
28            path.deleteCharAt(path.length()-1);
29        }
30    }
31}