/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) 
    {
      if(root==null)
        return true;
      return ab(root.left,root.right);
        
    }
     public boolean ab(TreeNode l,TreeNode r)
     {
         if(l==null || r==null)
             return l==r;
         if(l.val!=r.val)
           return false;
         return (ab(l.left,r.right) && ab(l.right,r.left));
     }
}
