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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot != null) {
            return false;
        }

        if(subRoot == null){
            return true;
        }

        if(root.val == subRoot.val && isSameTree(root,subRoot)){
            return true;
        } 
        
        boolean res1 = isSubtree(root.left, subRoot);
        boolean res2 = isSubtree(root.right, subRoot);

        return res1 || res2;

    }

      public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        if(p!=null && q!=null && p.val == q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }else{
            return false;
        }
    }
}
