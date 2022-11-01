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
    int dia;
    public int diameterOfBinaryTree(TreeNode root) {
        dia = 0;
        depth(root);
        return dia;
        
    }
    public int depth(TreeNode node){
        if(node == null) return 0;
        int l = depth(node.left);
        int r = depth(node.right);
        dia = Math.max(dia, l + r);
        return 1 + Math.max(l, r);
    }
}