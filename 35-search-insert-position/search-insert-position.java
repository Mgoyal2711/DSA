class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                return i;
            }else if(target < nums[i]){
                return i;
            }
        }return n;
    }
}