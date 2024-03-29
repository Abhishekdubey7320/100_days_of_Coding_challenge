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
 *       this.right = right;
      }
  }
       */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        //if root is null then we can't have any path, so return false.
        if(root == null)
        {
            return false;
        }
        //if the root is leaf node then target sum will be root value.
        //then only we can have a path.
        if(root.left == null && root.right == null)
        {
            //if targetSum == root.val, return true.
            //else return false.
            return (targetSum == root.val);
        }
        //Check these conditions for both the left and right sub-trees.
        //We will use conditional OR '||' because the path can exists
        //either in left subtree or in right subtree.
        //subtract the value of root in each recursion call.
        return((hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val)));
        
    }
