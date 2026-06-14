// Last updated: 6/14/2026, 11:40:11 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        
19        List<List<Integer>> ls = new ArrayList<>();
20        Queue<TreeNode> q = new LinkedList<>();
21        if(root==null)return ls;
22        q.add(root);
23        int level=1;
24        while(!q.isEmpty()){
25            int n = q.size();
26            ArrayList<Integer> ls1 = new ArrayList<>();
27            for(int i =0 ; i<n ; i++){
28                TreeNode r = q.poll();
29                ls1.add(r.val);
30                if(r.left!=null){
31                    q.add(r.left);
32                }
33                if(r.right!=null){
34                    q.add(r.right);
35                }
36            }
37            if(level%2==0){
38                Collections.reverse(ls1);
39                ls.add(ls1);
40            }
41            else{
42                ls.add(ls1);
43            }
44            level++;
45        }
46        return ls;
47    }
48}