// Last updated: 6/19/2026, 9:53:11 PM
1class Solution {
2
3    public List<String> generateParenthesis(int n) {
4        List<String> ans = new ArrayList<>();
5        backtrack(ans,n,0,0,"");
6        return ans;
7
8    }
9    public void backtrack(List<String> ans,int n ,int open ,int close,String str){
10        if(str.length()==n*2){
11            ans.add(str);
12            return;
13        }
14        if(open<n){
15            backtrack(ans,n,open+1,close,str+"(");
16        }
17        if(close<open){
18             backtrack(ans,n,open,close+1,str+")");
19        }
20    }
21}