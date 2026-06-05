/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        while(!q.isEmpty()){
            int n =q.size();
            List<Integer> ls1 = new ArrayList<>();
            for(int i = 0 ; i<n ; i++){
                TreeNode r = q.poll();
                ls1.add(r.val);
                if(r.left!=null){
                    q.add(r);
                }
                if(r.right!=null){
                    q.add(r);
                }
            }
            ls.add(ls1);
        }
        return ls;
    }
}