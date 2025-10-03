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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        // if (root.left == null && root.right == null)
        //     return targetSum == root.val;

        // return hasPathSum(root.left, targetSum - root.val) ||
        //        hasPathSum(root.right, targetSum - root.val);


        sum -= root.val;
        if(root.left == null && root.right == null){
            return sum == 0;
        }

        return hasPathSum(root.left, sum) ||
               hasPathSum(root.right, sum);
    }
}
