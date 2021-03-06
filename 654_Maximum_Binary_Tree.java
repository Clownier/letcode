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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
    	if(null == nums || 0 == nums.length) return null;
    	int idx = getMax(nums);
        TreeNode tn = new TreeNode(nums[idx]);
    	if(1 == nums.length){
    		tn.left = null;
    		tn.right =null;
    		return tn;
    	}
        tn.left = constructMaximumBinaryTree( Arrays.copyOfRange(nums,0,idx));
        tn.right = constructMaximumBinaryTree( Arrays.copyOfRange(nums,idx+1,nums.length));
        return tn;
    }
    
    private int getMax(int[] nums){
    	int idx = 0;
        for(int i = 0;i<nums.length;i++){
        	if(nums[idx]<nums[i])
        		idx = i;
        }
        return idx;
    }
}

// int[] newArray = Arrays.copyOfRange(oldArray, startIndex, endIndex);
// startIndex是要复制范围的初始索引，包括。
// endIndex是要复制的范围的最终索引，排它。 (此索引可能位于数组外)