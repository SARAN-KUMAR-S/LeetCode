// Last updated: 6/19/2026, 10:17:49 PM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        for(int i = 0 ;i<board.length ; i++){
4            for(int j  =0 ; j<board[0].length ; j++){
5                if(board[i][j]==word.charAt(0)){
6                if(backtrack(board,word,i,j,0)){
7                    return true;
8                }
9                
10                }
11            }
12        }
13        return false;
14        
15    }
16    public boolean backtrack(char[][] board , String word , int i ,int j , int index){
17        if(index==word.length()){
18            return true;
19        }
20        else if(i<0 || i>=board.length || j<0 ||j>=board[0].length|| board[i][j]=='#' || board[i][j]!=word.charAt(index)){
21            return false;
22        }
23        char temp = board[i][j];
24        board[i][j]='#';
25        boolean result=backtrack(board,word,i+1,j,index+1)||
26        backtrack(board,word,i-1,j,index+1)||
27        backtrack(board,word,i,j+1,index+1)||backtrack(board,word,i,j-1,index+1);
28        board[i][j]=temp;
29        return result;
30        
31    }
32}