class Solution {
public int[] findErrorNums(int[] nums) {
    int[] res = new int[2];
    for(int one:nums){
        if(one < 0) one = -one;
        if(nums[one -1]>0){
            nums[one -1] = - nums[one -1];
        }else{
            res[0] = one;
        }
    }
    for(int i = 0;i<nums.length;i++){
        if(nums[i]>0){
            res[1] = i + 1;
            return res;
        }
    }
    return res;
}
}		