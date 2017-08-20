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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
        	root = q.poll();
        	if(root.right != null){
        		q.add(root.right);
        	}
        	if(root.left != null){
        		q.add(root.left);
        	}
        }
        return root.val;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*public class Solution {
    
    
    public int findBottomLeftValue(TreeNode root) {
        
        return findBottomLeftValueHelper(root, 0, new int[]{root.val, 0});
    }
    
    public int findBottomLeftValueHelper(TreeNode root, int depth, int[] result) {
        
        //root cannot be null
        
        if (result[1] < depth) {
            result[1] = depth;
            result[0] = root.val;
        }
        
        if (root.left != null) findBottomLeftValueHelper(root.left, depth + 1, result);
        if (root.right != null) findBottomLeftValueHelper(root.right, depth + 1, result);
        
        
        return result[0];
        
    }*/