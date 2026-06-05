        List<List<Integer>> ls = new ArrayList<>();
       
    public List<List<Integer>> levelOrder(TreeNode root) {
class Solution {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n =q.size();
        if(root==null) return ls;
