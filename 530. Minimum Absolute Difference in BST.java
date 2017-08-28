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
    List<Integer> treeVals = new ArrayList<>();
    private void LDRtree(TreeNode node){
        if( node == null){
            return;
        }else {
            LDRtree(node.left);
            treeVals.add(node.val);
            LDRtree(node.right);
        }
    }
    public int getMinimumDifference(TreeNode root) {
        LDRtree(root);
        int min = 0x7fff_ffff;
        for(int i = 1 ; i < treeVals.size() ; i++){
            int absolute_dif = treeVals.get(i) - treeVals.get(i-1);
            min = min>absolute_dif?absolute_dif:min;
        }
        return min;
    }
}