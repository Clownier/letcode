class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> frequenty = new HashMap<>();
        for(int num:nums){
            Integer times = frequenty.get(num);
            if(times == null){
                times = 0;
            }
            if(times + 1 > nums.length/3){
                res.add(num);
                times = - nums.length;
            }
            frequenty.put(num,times + 1);
        }
        return  res;
    }
}

// public class Solution {
//     int target;
//     List<Integer> resList = new ArrayList<>();
//     public List<Integer> majorityElement(int[] nums) {
//         if (nums == null || nums.length == 0) {
//             return resList;
//         }
//         target = nums.length / 3;
//         threeWayPartition( nums, 0, nums.length - 1);
//         return resList;
//     }
    
//     private void threeWayPartition( int[] nums, int left, int right) {
//         if (right - left < target) return;
//         int i = left;
//         int lt = left;
//         int gt = right;
//         int pivot = nums[left];
//         while (i <= gt) {
//             if (nums[i] < pivot) {
//                 swap(nums, i, lt);
//                 i++;
//                 lt++;
//             } else if (nums[i] > pivot) {
//                 swap(nums, i, gt);
//                 gt--; 
//             } else {
//                 i++;
//             }
//         }
//         // count the number betwee lt and i
//         if (i - lt > target) {
//             resList.add(nums[lt]);
//         }
        
//         threeWayPartition(nums, left, lt - 1);
//         threeWayPartition(nums, gt + 1, right);
//     }
//     private void swap(int[] nums, int i, int j) {
//         int tmp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = tmp;
//     }
// }

class Solution {
      public List<Integer> majorityElement(int[] nums) 
      {
          List<Integer> list = new ArrayList<>();
          if(nums.length == 0)
          {
              return list;
          }
          int number1=nums[0],number2 = nums[0],count1 = 0,count2 = 0;
          for(int i=0;i<nums.length;i++)
          {
              if(number1==nums[i]){
                  count1++;
              }else if(number2==nums[i]){
                  count2++;
              }else if(count1==0){
                  number1=nums[i];
                  count1 = 1;
              } else if(count2==0){
                  number2=nums[i];
                  count2 = 1;
              }else{
                  count1--;
                  count2--;
              }
          }
          count1=0;
          count2=0;
          for(int i=0;i<nums.length;i++)
          {
              if(nums[i]==number1)
              {
                  count1++;
              }
              else if(nums[i]==number2)
              {
                  count2++;
              }
          }
          if(count1>nums.length/3)
          {
              list.add(number1);
          }
          if(count2>nums.length/3)
          {
              list.add(number2);
          }
          return list;
      }
}