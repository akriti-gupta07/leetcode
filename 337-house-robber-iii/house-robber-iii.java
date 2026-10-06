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
    public int rob(TreeNode root) {
        
        int[] result=new int[2];
        result=traverse(root);
        return Math.max(result[0],result[1]);


    }
        public int[] traverse(TreeNode root){
            if(root==null){
                return new int[]{0,0};
            }
            int[] left_traverse=traverse(root.left);
            int[] right_traverse=traverse(root.right);
            int[] option=new int[2];
            option[0]=left_traverse[1]+right_traverse[1]+root.val;
            option[1]=Math.max(left_traverse[1],left_traverse[0])+Math.max(right_traverse[0],right_traverse[1]);
        
            return option;
        }

        
    
}