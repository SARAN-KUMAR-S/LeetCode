// Last updated: 6/9/2026, 10:04:53 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        if(root==null){
14            return null;
15        }
16        
17        else if(root==p || root==q){
18            return root;
19        }
20       else if((p.val<root.val && q.val>root.val) ||( p.val>root.val && q.val<root.val)){
21        return root;
22       }
23        else if(p.val<root.val||q.val<root.val){
24            return lowestCommonAncestor(root.left , p,q);
25        }
26        else{
27            return lowestCommonAncestor(root.right,p,q);
28        }
29        
30    }
31}