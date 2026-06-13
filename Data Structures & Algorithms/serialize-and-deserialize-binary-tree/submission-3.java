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

public class Codec {
    StringBuilder str = new StringBuilder();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "";
        }
        
        dfsAppendtoString(root);
        
        return str.toString();
        
    }
    Integer index = 0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] inputArr = data.split(",");
        return dfsDeserialize(inputArr);
    }

    private TreeNode dfsDeserialize(String[] inputArr) {
        if (inputArr[index].equals("N") || inputArr[index].equals("")) {
            index++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(inputArr[index]));
        index++;
        node.left = dfsDeserialize(inputArr);
        node.right = dfsDeserialize(inputArr);
        return node;
    } 

    private void dfsAppendtoString(TreeNode root){
        if(root == null){
            str.append("N" + ",");
            return;
        }
        str.append(root.val + ",");
        dfsAppendtoString(root.left);
        dfsAppendtoString(root.right);

    }
}
