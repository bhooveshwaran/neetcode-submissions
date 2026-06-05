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
    public int kthSmallest(TreeNode root, int k) {
        //Smallest will be in the left. Biggest in the right.

        List<Integer> arr = new ArrayList<>();
        // In-order Traversal: Left -> Root -> Right

        dfs(root, arr); // Store in Array
        // kth element in array is the answer. return kth element
        return arr.get(k - 1);
    }

    private void dfs(TreeNode node, List<Integer> arr) {
        if (node == null) {
            return;
        }
        //Goes to null of left most node and returns.
        dfs(node.left, arr);
        arr.add(node.val);
        dfs(node.right, arr);
    }
}
