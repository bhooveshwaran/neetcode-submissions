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


public class Solution {

    public int maxPathSum(TreeNode root) {
        int[] res = new int[]{root.val};
        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode root, int[] res) {
        //Base case, root != null
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(dfs(root.left, res), 0);
        int rightMax = Math.max(dfs(root.right, res), 0);

        //For each root, path sum = root.left + root + root.right
        //One twist in this solution is instead of immediate left the Max of Left is used.
        res[0] = Math.max(res[0], root.val + leftMax + rightMax);
        
        return root.val + Math.max(leftMax, rightMax);
    }
}
