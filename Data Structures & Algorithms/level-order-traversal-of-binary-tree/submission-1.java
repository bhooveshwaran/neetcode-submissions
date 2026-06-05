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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        // Breadth First Search. 
        q.add(root);
        //Loop to continue to next level
        while(!q.isEmpty()){
            List<Integer> levelList = new ArrayList<>();
            //Loop for current level. Poll|Process|AddNext
            for(int i = q.size(); i>0; i--){
                //Poll - remove current level nodes
                TreeNode polled = q.poll();
                // Process current level. = Add Element into Level List. 
                if(polled != null){
                    levelList.add(polled.val);
                    //Add Children
                    q.add(polled.left);
                    q.add(polled.right);
                }
            }
            // Add all the returned Lists into a final List.
            //If Empty List, don't add.
            if(levelList.size() > 0){
                finalList.add(levelList);
            }
        }
        
        // Return the Final List.
        return finalList;
    }
}
