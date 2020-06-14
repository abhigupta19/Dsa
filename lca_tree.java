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
  boolean v1=false;
  boolean v2=false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
             TreeNode temp=node(root,p,q);
              if(v1 && v2)
                return temp;
              return null;
      
          
        
    }
  TreeNode node(TreeNode root,TreeNode p,TreeNode q)
  {
      if(root==null)
        return null;
    TreeNode temp=null;
    if(root==p)
    {
      temp=root;
      v1=true;
      
    }
    if(root==q)
    {
      temp=root;
      v2=true;
      
    }
    TreeNode l=node(root.left,p,q);
    TreeNode r=node(root.right,p,q);
    if(temp!=null)
      return temp;
    if(l!=null && r!=null)
      return root;
    return(l!=null?l:r);
    
  }
}
