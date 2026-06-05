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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Copy root node to traverse.
        TreeNode cur = root;
        // Loop until traverse node reached end of tree
        while (cur != null) {
            // if p and q are greater than traverse node 
                if (p.val > cur.val && q.val > cur.val) {
                // go right.
                cur = cur.right;
                }
            // else if p and q are less than traverse node
             else if (p.val < cur.val && q.val < cur.val) {
                // go left
                cur = cur.left;
            }
            // else the current node is corretly in the middle of p and q.
             else {
                // return the traverse node 
                return cur;
            }
        }
        // return null if nothing is found.
         return null;
    }
}
