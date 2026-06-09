// Last updated: 6/9/2026, 10:04:13 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    
18    public boolean isValidBST(TreeNode root1) {
19        List<Integer> ls = new ArrayList<>();
20        valid(root1,ls);
21        for(int i = 1; i<ls.size(); i++){
22            //System.out.print(ls.get(i));
23            if(ls.get(i)<=ls.get(i-1)){
24                return false;
25            }
26        }
27        return true;
28    }
29    public void valid(TreeNode root,List<Integer> ls){
30        if(root==null){
31            return;
32        }
33        valid(root.left,ls);
34        ls.add(root.val);
35        valid(root.right,ls);
36    }
37}