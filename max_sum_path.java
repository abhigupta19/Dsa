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
  int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int t=sum(root);
        return res;
        
    }
   int sum(TreeNode root)
    {
        if(root==null)
        return 0;
        int l=sum(root.left);
        int r=sum(root.right);
        int temp=Math.max(Math.max(l,r)+root.val,root.val);
        int ans=Math.max(temp,l+r+root.val);
        res=Math.max(res,ans);
        return temp;
        
    
    }
}
