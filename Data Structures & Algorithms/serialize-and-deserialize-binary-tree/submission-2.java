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

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] inputArr = data.split(",");
         int[] i = {0};
        return dfsDeserialize(inputArr, i);
    }

    private TreeNode dfsDeserialize(String[] inputArr, int[] i) {
        if (inputArr[i[0]].equals("N") || inputArr[i[0]].equals("")) {
            i[0]++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(inputArr[i[0]]));
        i[0]++;
        node.left = dfsDeserialize(inputArr, i);
        node.right = dfsDeserialize(inputArr, i);
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
