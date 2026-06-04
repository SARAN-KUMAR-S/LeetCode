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
    List<Integer> ls = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return ls;
    }

    public void preorder(TreeNode root1){
        if(root1==null){
            return;
        }
        ls.add(root1.val);
        preorder(root1.left);
        preorder(root1.right);
    }
}